package com.example.lahermandad.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.lahermandad.model.cervezas
import com.google.firebase.firestore.FirebaseFirestore

class repo {
    fun getBeerData():LiveData<MutableList<cervezas>> {
        val mutabledata = MutableLiveData<MutableList<cervezas>>()

        FirebaseFirestore.getInstance().collection("Cervezas").get()
            .addOnSuccessListener { result ->
                val listaData = mutableListOf<cervezas>()
                for (document in result){
                    val titulo = document.getString("titulo")
                    val precio = document.getString("precio")
                    val grado = document.getString("grado")
                    val image = document.getString("image")

                    val cerveza = cervezas(titulo!!,precio!!,grado!!,image!!)
                    listaData.add(cerveza)
                }
                mutabledata.value = listaData

        }
        return mutabledata

    }

}