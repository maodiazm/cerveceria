package com.example.lahermandad.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.lahermandad.R
import java.util.ArrayList


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_home, container, false)

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cardNos = view.findViewById<ImageView>(R.id.cardnosotros)

        cardNos.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_NosotrosFragment)
        }
        val cardCom = view.findViewById<ImageView>(R.id.cardcomentarios)

        cardCom.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_ComentariosFragment)
        }
        val cardComp = view.findViewById<ImageView>(R.id.cardcompras)

        cardComp.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_ComprasFragment)
        }
        val cardDes = view.findViewById<ImageView>(R.id.cardlista)

        cardDes.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_DeseoFragment)
        }
        val cardGps = view.findViewById<ImageView>(R.id.cardubicacion)

        cardGps.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_GpsFragment)
        }
        val cardUs = view.findViewById<ImageView>(R.id.cardusuarios)

        cardUs.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_UsuarioFragment)
        }
    }

}
