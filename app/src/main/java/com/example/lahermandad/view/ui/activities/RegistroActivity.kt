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

class RegistroActivity : AppCompatActivity() {
    lateinit var registrobutton:Button
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        firebaseAuth = Firebase.auth
        registrobutton = findViewById(R.id.registrobutton)
        val correo=findViewById<EditText>(R.id.correo)
        val contrasena=findViewById<EditText>(R.id.password)

        registrobutton.setOnClickListener {
            crearUsuario(correo.text.toString(),contrasena.text.toString())
        }

    }
    private fun crearUsuario(correo:String, contrasena:String){
        firebaseAuth.createUserWithEmailAndPassword(correo,contrasena)
            .addOnCompleteListener(this) {
                Task->if(Task.isSuccessful){
                    Toast.makeText(baseContext,"Usuario Creado Exitosamente",Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this,login::class.java))
                }else{
                    Toast.makeText(baseContext, "Error al crear Usuario",Toast.LENGTH_SHORT).show()
                }
            }
    }
}