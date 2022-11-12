package com.example.lahermandad.view.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.lahermandad.R

class NosotrosAdapter: RecyclerView.Adapter<NosotrosAdapter.ViewHolder>(){

    override fun onCreateViewHolder(ViewGroup: ViewGroup, i:Int): ViewHolder{
    val v = LayoutInflater.from(ViewGroup.context).inflate(R.layout.card_view_nosotros,ViewGroup, false)
        return ViewHolder(v)
    }

 inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var itemImage: ImageView
    var itemTitle: TextView
    var itemPrecio: TextView
    var itemGrado: TextView

    init{
        itemImage = itemView.findViewById(R.id.image1)
        itemTitle = itemView.findViewById(R.id.title)
        itemPrecio = itemView.findViewById(R.id.precio)
        itemGrado = itemView.findViewById(R.id.grado)
        }
    }

    val titles = arrayOf ("Cerveza Boiler","Cerveza Goblin","Cerveza Gold Pot", "Cerveza Chaos")
    val precios = arrayOf("$5500","S4800","$5200","$5800")
    val grados = arrayOf("4,5% Grados","5,2% Grados","4,7% Grados","5,5% Grados")
    val image = arrayOf(R.drawable.boiler,R.drawable.goblin,R.drawable.golpot,R.drawable.chaos)


    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text= titles[i]
        viewHolder.itemGrado.text= grados[i]
        viewHolder.itemPrecio.text= precios[i]
        viewHolder.itemImage.setImageResource(image[i])
    }

    override fun getItemCount(): Int {
        return titles.size
    }
}