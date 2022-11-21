package com.example.lahermandad.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lahermandad.R
import com.example.lahermandad.model.compras
import com.example.lahermandad.view.adapter.ComprasAdapter
import com.example.lahermandad.view.adapter.OnCompraItemClickListener
import com.example.lahermandad.viewmodel.ComprasViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView


class ComprasFragment : Fragment(), OnCompraItemClickListener {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: ComprasAdapter
    private val viewModel by lazy { ViewModelProvider(this).get(ComprasViewModel::class.java) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttom = view.findViewById<BottomNavigationView>(R.id.buttonNavigationHome)
        buttom.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.home -> findNavController().navigate(R.id.action_comprasFragment_to_homeFragment)
            }
        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_compras, container, false)
        recyclerView=view.findViewById(R.id.recyclerviewcompra)
        adapter= ComprasAdapter(requireContext(), this)
        recyclerView.layoutManager=LinearLayoutManager(context)
        recyclerView.adapter=adapter
        observeData()
        return view
    }

    private fun observeData() {
        viewModel.fetchComprasData().observe(viewLifecycleOwner, Observer {
            adapter.setListData(it)
            adapter.notifyDataSetChanged()
        })
    }

    override fun onItemclick(cerveza: compras, position: Int) {
        TODO("Not yet implemented")
    }


}