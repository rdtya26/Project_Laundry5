package com.example.project_laundry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.project_laundry.ROOM.adapterlaundry
import com.example.project_laundry.ROOM.database_laundry
import com.example.project_laundry.databinding.ActivityTampildataBinding
import com.example.project_laundry.databinding.AdapterBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Collections.addAll

class tampildata : AppCompatActivity() {

    private lateinit var binding: ActivityTampildataBinding
    private val db by lazy { database_laundry(this) }
    private lateinit var adapterBinding: AdapterBinding
    private var list = arrayListOf<database_laundry>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityTampildataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.flaoting.setOnClickListener{
            startActivity(Intent(this,
                dashboard::class.java)
            )
        }
    }

    override fun onResume() {
        super.onResume()
        getdata()
    }
    fun getdata(){
        binding.list.layoutManager = LinearLayoutManager(this)
        CoroutineScope(Dispatchers.IO).launch {
            val data = db.laundrydao().getAll()
            adapterBinding

            }
        }

    }
