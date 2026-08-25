package com.example.validadordeedad

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VerificarViewModel : ViewModel() {

    private val _resultado = MutableLiveData<String>()
    val resultado: LiveData<String> get() = _resultado

    fun verificarEdad(edadTexto: String) {
        val edad = edadTexto.toIntOrNull()

        if (edad == null) {
            _resultado.value = "Por favor ingresa un número válido"
            return
        }

        when {
            edad < 0 -> _resultado.value = "" // Reto: borra el mensaje si es negativo
            edad >= 18 -> _resultado.value = "Eres mayor de edad"
            else -> _resultado.value = "Eres menor de edad"
        }
    }
}
