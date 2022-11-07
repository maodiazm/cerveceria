package com.example.lahermandad.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lahermandad.R
import com.example.lahermandad.view.adapter.NosotrosAdapter


class NosotrosFragment : Fragment() {

    lateinit var recyclerNos: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_nosotros, container, false)
        recyclerNos = view.findViewById(R.id.recyclerview)
        val adapter = NosotrosAdapter()
        recyclerNos.layoutManager = LinearLayoutManager(context)
        recyclerNos.adapter = adapter
        return view
    }


}