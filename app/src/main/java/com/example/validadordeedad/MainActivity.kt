package com.example.validadordeedad

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val viewModel: VerificarViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEdad = findViewById<EditText>(R.id.etEdad)
        val btnVerificar = findViewById<Button>(R.id.btnVerificar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnVerificar.setOnClickListener {
            viewModel.verificarEdad(etEdad.text.toString())
        }

        viewModel.resultado.observe(this) { mensaje ->
            tvResultado.text = mensaje
        }
    }
}
