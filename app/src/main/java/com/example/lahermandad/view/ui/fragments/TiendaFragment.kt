package com.example.lahermandad.view.ui.fragments

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lahermandad.R
import com.example.lahermandad.view.adapter.NosotrosAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView


class TiendaFragment : Fragment() {

    lateinit var recyclerNos: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tienda, container, false)
        recyclerNos = view.findViewById(R.id.recyclerview)
        val adapter = NosotrosAdapter()
        recyclerNos.layoutManager = LinearLayoutManager(context)
        recyclerNos.adapter = adapter
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttom = view.findViewById<BottomNavigationView>(R.id.buttonNavigationMenu)
        buttom.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.home -> findNavController().navigate(R.id.action_tiendaFragment_to_HomeFragment)
                R.id.recomendado -> findNavController().navigate(R.id.action_tiendaFragment_to_RecomendadoFragment)
                R.id.mapa -> findNavController().navigate(R.id.action_tiendaFragment_to_GpsFragment)
                R.id.perfil -> findNavController().navigate(R.id.action_tiendaFragment_to_UsuarioFragment)
            }
        }

    }

}