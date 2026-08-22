package com.example.validadordeedad

import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import androidx.lifecycle.ViewModel

class ValidarViewModel: ViewModel() {
    private val _edad= MutableStateFlow(0)
    val edad: StateFlow<Int>=_edad



    fun validarEdad(){




    }







}