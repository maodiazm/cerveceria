package com.example.lahermandad.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lahermandad.R
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class GpsFragment : Fragment(), OnMapReadyCallback {
    private lateinit var googleMap : GoogleMap


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_gps, container, false)
        val mapFragment=this.childFragmentManager.findFragmentById(R.id.VistaMapa) as SupportMapFragment
        mapFragment.getMapAsync(this)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttom = view.findViewById<BottomNavigationView>(R.id.buttonNavigationMenu)
        buttom.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.home -> findNavController().navigate(R.id.action_gpsFragment_to_homeFragment)
                R.id.recomendado -> findNavController().navigate(R.id.action_gpsFragment_to_recomendadoFragment)
                R.id.tienda -> findNavController().navigate(R.id.action_gpsFragment_to_tiendaFragment)
            }
        }

    }

    override fun onMapReady(p0: GoogleMap) {

    }


}