package com.example.lahermandad.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.lahermandad.R

class RegistroActivity : AppCompatActivity() {
    lateinit var registrobutton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        registrobutton = findViewById(R.id.registrobutton)
        registrobutton.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
        }

    }
}