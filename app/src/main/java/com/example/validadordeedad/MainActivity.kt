package com.example.validadordeedad

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val miViewModel: ValidarViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val etEdad: TextView = findViewById(R.id.etEdad)
        val btnValidar =findViewById<Button>(R.id.btnVerificar)







        }
}
