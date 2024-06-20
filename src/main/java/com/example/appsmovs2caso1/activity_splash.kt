package com.example.appsmovs2caso1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent

class activity_splash : AppCompatActivity() {

    private val tiempoDeEspera: Long = 2000 // 3000 milisegundos = 3 segundos


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, tiempoDeEspera)
    }
}