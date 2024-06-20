package com.example.appsmovs2caso1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class activity_showinfo: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showinfo)

        val nombre = intent.getStringExtra("NOMBRE")
        val apellido = intent.getStringExtra("APELLIDO")
        val edad = intent.getStringExtra("EDAD")

        val displayTex = "Nombre: $nombre\nApellido: $apellido\nEdad: $edad"
        val textViewDispla = findViewById<TextView>(R.id.textViewDisplay)
        textViewDispla.text = displayTex


        //regros a menu principal
        val openRegisterActivity = findViewById<Button>(R.id.btnBack)

        openRegisterActivity.setOnClickListener{
            setContentView(R.layout.activity_main)
        }
    }
}