package com.example.project_laundry.ROOM

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.project_laundry.R

class adaptersetrikalaundry(val list: ArrayList<Laundry2>, var Listener: OnClickListener):
    RecyclerView.Adapter<adaptersetrikalaundry.laundryholder>(){

        class laundryholder(view: View) : RecyclerView.ViewHolder(view) {
            val NAMA = itemView.findViewById<TextView>(R.id.nameadapter)
            val JENIS = itemView.findViewById<TextView>(R.id.jenisadapter)
            val ESTIMASI = itemView.findViewById<TextView>(R.id.estimasiadapter)
            val TITIK3 = itemView.findViewById<Button>(R.id.titik3)
            val EDIT = itemView.findViewById<Button>(R.id.edit)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): laundryholder {
            val view = LayoutInflater.from(parent.context).inflate(
                R.layout.adapter,
                parent,
                false

            )
            return laundryholder(view)
        }

        override fun onBindViewHolder(holder: laundryholder, position: Int) {
            holder.NAMA.text  = list[position].nama
            holder.JENIS.text = list[position].jenis
            holder.ESTIMASI.text = list[position].detail
            holder.TITIK3.setOnClickListener(){
                Listener.onDetail(list[position])}
            holder.EDIT.setOnClickListener(){
                Listener.onEdit(list[position])
            }
        }

        override fun getItemCount(): Int {
            return list.size
        }

    interface OnClickListener{
        fun onDetail (laundry: Laundry)
        fun onEdit (laundry: Laundry)
    }
    }

