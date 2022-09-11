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
            "C" -> listC()
            "D" -> listD()
            "E" -> listE()
            "F" -> listF()
            "G" -> listG()
            "H" -> listH()
            "I" -> listI()
            "J" -> listJ()

        }







    }
    fun listA(){

        val listdata = arrayListOf(
            ListData("ASTROBOY"),
            ListData("ANTMAN"),
            ListData("AQUAMAN"),

            )
        val adapter = Adapter(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.halamanSatu)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listB(){

        val listdata = arrayListOf(
            ListData("BATMAN"),
            ListData("BUCKY"),
            ListData("BUKU"),

            )
        val adapter = Adapter(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.halamanSatu)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listC(){

        val listdata = arrayListOf(
            ListData("CAPTAIN"),
            ListData("CYBORG"),
            ListData("CABAI"),

            )
        val adapter = Adapter(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.halamanSatu)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter

    }
    fun listD(){
        val listdata = arrayListOf(
            ListData("DAREDEVIL"),
            ListData("DOMPET"),
            ListData("DASI"),

            )
        val adapter = Adapter(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.halamanSatu)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listE(){
        val listdata = arrayListOf(
            ListData("EGOIS"),
            ListData("EDITOR"),
            ListData("EMAIL"),

            )
        val adapter = Adapter(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.halamanSatu)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listF(){
        val listdata = arrayListOf(
            ListData("FALCON"),
            ListData("FAKULTAS"),
            ListData("FATAMORGANA"),

            )
        val adapter = Adapter(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.halamanSatu)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listG(){
        val listdata = arrayListOf(
            ListData("GUNUNG"),
            ListData("GENGSTER"),
            ListData("GEROBAK"),

            )
        val adapter = Adapter(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.halamanSatu)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listH(){
        val listdata = arrayListOf(
            ListData("HAKIKAT"),
            ListData("HALUSINASI"),
            ListData("HEWAN"),

            )
        val adapter = Adapter(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.halamanSatu)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter

    }
    fun listI(){
        val listdata = arrayListOf(
            ListData("IKAN"),
            ListData("INVASI"),
            ListData("INDIVIDUALISME"),

            )
        val adapter = Adapter(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.halamanSatu)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun listJ(){
        val listdata = arrayListOf(
            ListData("JEMBATAN"),
            ListData("JAMBU"),
            ListData("JAMUR"),

            )
        val adapter = Adapter(listdata)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.halamanSatu)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }




}