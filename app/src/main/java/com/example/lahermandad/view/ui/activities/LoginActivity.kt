package com.example.lahermandad.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lahermandad.R

class LoginActivity : AppCompatActivity() {
    lateinit var registrobutton : Button
    lateinit var iniciobutton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        iniciobutton=findViewById(R.id.Binicio)
        registrobutton=findViewById(R.id.BRegistro)
        registrobutton.setOnClickListener { //it:View!

            startActivity(Intent(this,RegistroActivity::class.java))
        }
        iniciobutton.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}