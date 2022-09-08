package com.example.challangechapter3

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView

class Adapter(val listData : ArrayList<ListData>):RecyclerView.Adapter<Adapter.ViewHolder>() {
    lateinit var context : Context
    class ViewHolder (view : View):RecyclerView.ViewHolder(view){
        var btn = view.findViewById<Button>(R.id.btn)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_btn,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.btn.text = listData[position].btnNama
        holder.btn.setOnClickListener (object  : View.OnClickListener{
            override fun onClick(v: View?) {
                if (holder.btn.length() == 1){

                    val x = v!!.context as AppCompatActivity
                    val huruf = FragmentSatu(holder.btn.text.toString())
                    x.supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView2,huruf).addToBackStack(null).commit()
                    Toast.makeText(context,"berhasil",Toast.LENGTH_SHORT).show()
                }else{
                    val link = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q= ${holder.btn.text.toString()}"))
                    context.startActivity(link)
                }

            }

        })



    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
    }


}