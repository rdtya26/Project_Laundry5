package com.example.project_laundry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL
import com.example.project_laundry.ROOM.Laundry
import com.example.project_laundry.ROOM.adapterlaundry
import com.example.project_laundry.ROOM.database_laundry
import com.example.project_laundry.databinding.ActivityTampildataBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class tampildata : AppCompatActivity() {

    private lateinit var binding: ActivityTampildataBinding
    private val db by lazy { database_laundry(this) }
    private lateinit var adapterlaundry: adapterlaundry
    private lateinit var databaseLaundry: database_laundry

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityTampildataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapterlaundry = adapterlaundry(arrayListOf(),
            object : adapterlaundry.OnClickListener{
                override fun onDetail(laundry: Laundry) {
                   detail(laundry)
                }

                override fun onEdit(laundry: Laundry) {
                updateData(laundry)
            }
        }

        )
        binding.list.adapter = adapterlaundry
        binding.list.layoutManager = LinearLayoutManager(applicationContext,
        VERTICAL,false)
        binding.list.addItemDecoration(
            DividerItemDecoration(
                applicationContext,LinearLayoutManager.VERTICAL
            )
        )

        binding.flaoting.setOnClickListener{
            startActivity(Intent(this,
                dashboard::class.java)
            )
        }
    }
    private fun detail(laundry: Laundry){
        startActivity(Intent(this,detail::class.java).
        putExtra("idcucian", Laundry.idcuci.toString()))
    }

    private fun updateData(laundry: Laundry){
        startActivity(Intent(this,edit_laundry::class.java).
        putExtra("idcucian",Laundry.idcuci.toString()))
    }


    fun getdata(){
        binding.list.layoutManager = LinearLayoutManager(this)
        CoroutineScope(Dispatchers.IO).launch {
            val data = db.laundrydao().getAll()
            adapterlaundry.list.addAll(data)
            withContext(Dispatchers.Main){
                adapterlaundry.notifyDataSetChanged()
            }
            }
        binding.list.adapter = adapterlaundry
        }
    override fun onResume() {
        super.onResume()
        getdata()
    }
    }
