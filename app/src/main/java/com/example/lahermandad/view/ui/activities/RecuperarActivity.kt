package com.example.lahermandad.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.lahermandad.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RecuperarActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    lateinit var restaurarbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_recuperar)
            firebaseAuth=Firebase.auth
            restaurarbutton=findViewById(R.id.Recuperarbutton)
            val correo=findViewById<EditText>(R.id.correorestaurar)
            restaurarbutton.setOnClickListener{
                cambiocontrasena(correo.text.toString())
            }

        }

        private fun cambiocontrasena(correo:String){
            firebaseAuth.sendPasswordResetEmail(correo)
                .addOnCompleteListener(this){
                        task->if(task.isSuccessful){
                        Toast.makeText(baseContext, "Correo recuperación contraseña enviado", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, LoginActivity::class.java))
                } else {
                    Toast.makeText(baseContext, "El correo electronico no existe", Toast.LENGTH_SHORT).show()
                }
                }

        }
}
