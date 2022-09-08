package com.example.challangechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_home.*

class FragmentHome : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listdata = arrayListOf(
            ListData("A"),
            ListData("B"),
            ListData("C"),
            ListData("D"),
            ListData("E"),
            ListData("F"),
            ListData("G"),
            ListData("H"),
            ListData("I"),
            ListData("J"),
        )
//        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview)
//        val adapter = Adapter(listdata)
//        val ln = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
//        recyclerview.layoutManager = ln
//
//
//        recyclerView.adapter = adapter
        val adapter = Adapter(listdata)
        val layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter


    }



}