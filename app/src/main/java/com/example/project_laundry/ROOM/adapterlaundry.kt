package com.example.project_laundry.ROOM

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_laundry.R

class adapterlaundry (var list: ArrayList<adapterlaundry>):
        RecyclerView.Adapter<adapterlaundry.laundryholder>(){
            class laundryholder (view: View) : RecyclerView.ViewHolder(view){


                val id = itemView.findViewById<TextView>(R.id.idlaundry)
                val nama = itemView.findViewById<TextView>(R.id.nameadapter)
                val jenis = itemView.findViewById<TextView>(R.id.jenisadapter)
                val estimasi = itemView.findViewById<TextView>(R.id.estimasiadapter)
                val titik3 = itemView.findViewById<Button>(R.id.titik3)
                val edit = itemView.findViewById<Button>(R.id.edit)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): laundryholder {
    val view = LayoutInflater.from(parent.context).inflate(
        R.layout.adapter,parent,false
    )
        return  laundryholder(view)
    }

    override fun onBindViewHolder(holder: laundryholder, position: Int) {

    }

    override fun getItemCount(): Int {
      return list.size
    }
}
