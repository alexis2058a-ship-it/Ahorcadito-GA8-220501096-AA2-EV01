package com.example.ahorcadito

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var palabra: TextView? = null
    private var intentos: TextView? = null
    private var btnNuevoJuego: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        palabra = findViewById(R.id.palabra)
        intentos = findViewById(R.id.intentos)
        btnNuevoJuego = findViewById(R.id.btnNuevoJuego)

        btnNuevoJuego?.setOnClickListener {
            nuevoJuego()
        }
    }

    private fun nuevoJuego() {
        palabra?.text = "_ _ _ _ _"
        intentos?.text = "Intentos: 6"
    }
}
