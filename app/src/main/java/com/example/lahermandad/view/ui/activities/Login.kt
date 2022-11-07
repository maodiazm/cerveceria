package com.example.lahermandad.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.lahermandad.R

class login : AppCompatActivity() {

    lateinit var registrobutton : Button
    lateinit var iniciobutton : Button
    lateinit var recuperarbutton : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        iniciobutton=findViewById(R.id.Binicio)
        registrobutton=findViewById(R.id.BRegistro)
        recuperarbutton=findViewById(R.id.BRecuperar)

        registrobutton.setOnClickListener {
            startActivity(Intent( this,RegistroActivity::class.java ))
        }

        iniciobutton.setOnClickListener {
            startActivity(Intent( this,HomeActivity::class.java ))
        }

        recuperarbutton.setOnClickListener {
            startActivity(Intent( this,RecuperarActivity::class.java ))
        }

    }
}