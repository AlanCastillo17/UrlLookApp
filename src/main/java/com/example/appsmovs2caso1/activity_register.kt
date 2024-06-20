package com.example.appsmovs2caso1

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class activity_register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val openRegisterActivity = findViewById<Button>(R.id.btnRegistrar)

        openRegisterActivity.setOnClickListener{

            val nombre = findViewById<EditText>(R.id.editTextNombre).text.toString()
            val apellido = findViewById<EditText>(R.id.editTextApellido).text.toString()
            val edad = findViewById<EditText>(R.id.editTextEdad).text.toString()

            val intent = Intent(this, activity_showinfo::class.java)
            intent.putExtra("NOMBRE", nombre)
            intent.putExtra("APELLIDO", apellido)
            intent.putExtra("EDAD", edad)
            startActivity(intent)
        }
    }
}


