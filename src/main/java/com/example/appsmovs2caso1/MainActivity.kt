package com.example.appsmovs2caso1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.content.Intent
import android.net.Uri
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Funcion boton pagina institucional
        val openLinkumbButton = findViewById<Button>(R.id.pageBtn)
        val webLink = "https://umbvirtual.edu.co"

        openLinkumbButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(webLink))
            startActivity(intent)
        }

        //Funcion boton buscador
        val urlEditText = findViewById<EditText>(R.id.urlText)
        val searchButton = findViewById<Button>(R.id.searchBtn)

        urlEditText.setOnClickListener {
            val webLink = urlEditText.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(webLink))
            startActivity(intent)
        }

        //Funcion boton registro
        val openRegisterActivity = findViewById<Button>(R.id.registerBtn)

        openRegisterActivity.setOnClickListener{
            setContentView(R.layout.activity_register)
        }

        //Funcion boton ver registro
        val openShowActivity = findViewById<Button>(R.id.verifyBtn)

        openShowActivity.setOnClickListener{
            setContentView(R.layout.activity_showinfo)
        }

        //Funcion boton toast
        val toastBtn: Button = findViewById(R.id.toastBtn)
        toastBtn.setOnClickListener {
            showToast()
        }
    }

    //Funcion toast
    private fun showToast() {
        val inflater: LayoutInflater = layoutInflater
        val view: View? = inflater.inflate(R.layout.custom_toast,
        findViewById(R.id.toast_layout_root))

        val toast: Toast = Toast(this)

        toast.duration = Toast.LENGTH_SHORT
        toast.view = view
        toast.show()
    }
}