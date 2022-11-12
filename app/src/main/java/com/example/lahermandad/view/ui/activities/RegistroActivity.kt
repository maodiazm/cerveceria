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
        firebaseAuth= Firebase.auth
        registrobutton = findViewById(R.id.registrobutton)
        val nombre=findViewById<EditText>(R.id.nombreusuario)
        val contrasena=findViewById<EditText>(R.id.contrasena)
        val correo=findViewById<EditText>(R.id.correoelectronico)
        val fechanacimiento=findViewById<EditText>(R.id.fechanacimiento)
        registrobutton.setOnClickListener{
            crearcuenta(correo.text.toString(),contrasena.text.toString())
        }

    }
    private fun crearcuenta(contrasena:String, correo:String){
        firebaseAuth.createUserWithEmailAndPassword(correo, contrasena)
            .addOnCompleteListener(this){
                    Task->if(Task.isSuccessful){
                        Toast.makeText(baseContext, "Usuario Registrado", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this, HomeActivity::class.java))
                }else{
                    Toast.makeText(baseContext, "Error registro usario", Toast.LENGTH_SHORT).show()
                }
                }
        }


}
