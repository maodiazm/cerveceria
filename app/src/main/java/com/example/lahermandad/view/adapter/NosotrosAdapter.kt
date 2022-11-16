package com.example.lahermandad.view.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.lahermandad.R
import com.example.lahermandad.model.cervezas
import com.squareup.picasso.Picasso

class NosotrosAdapter(private val context: Context): RecyclerView.Adapter<NosotrosAdapter.ViewHolder>(){
    private var beerlista = mutableListOf<cervezas>()

    fun setListData(data:MutableList<cervezas>){
        beerlista = data
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(ViewGroup: ViewGroup, i:Int): ViewHolder{
    val v = LayoutInflater.from(ViewGroup.context).inflate(R.layout.card_view_nosotros,ViewGroup, false)
        return ViewHolder(v)
    }

 inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
     fun binWeb(cerveza: cervezas){
         itemView.findViewById<TextView>(R.id.title).text=cerveza.titulo
         itemView.findViewById<TextView>(R.id.precio).text=cerveza.precio
         itemView.findViewById<TextView>(R.id.grado).text=cerveza.grado
         Picasso.with(context).load(cerveza.image).into(itemView.findViewById<ImageView>(R.id.image1))
     }
 }


    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val cerveza=beerlista[i]
        viewHolder.binWeb(cerveza)
    }

    override fun getItemCount(): Int {
        return if(beerlista.size > 0){
            beerlista.size
        }else{
            0
        }
    }
}