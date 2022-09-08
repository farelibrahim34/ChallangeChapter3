package com.example.challangechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FragmentSatu : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var huruf = arguments?.getString("huruf")
        Toast.makeText(context, huruf.toString(), Toast.LENGTH_SHORT).show()
        when (huruf){
            "A" -> listA()
            "B" -> listB()
            else -> Toast.makeText(context, "else di pilih", Toast.LENGTH_SHORT).show()
        }







    }
    fun listA(){

        val listdata = arrayListOf(
            ListData("APEL"),
            ListData("ABADI"),
            ListData("ADMINISTRASI"),

            )
        val adapter = Adapter(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.halamanSatu)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listB(){

        val listdata = arrayListOf(
            ListData("b"),
            ListData("B"),
            ListData("ADMINISTRASI"),

            )
        val adapter = Adapter(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.halamanSatu)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }


}