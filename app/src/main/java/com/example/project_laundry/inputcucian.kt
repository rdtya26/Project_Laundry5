package com.example.project_laundry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project_laundry.ROOM.Laundry
import com.example.project_laundry.ROOM.database_laundry
import com.example.project_laundry.databinding.ActivityInputcucianBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class inputcucian : AppCompatActivity() {

    private lateinit var binding: ActivityInputcucianBinding
    private val db by lazy { database_laundry(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputcucianBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.inputcuci.setOnClickListener {
            this.insertcucian()
        }
    }
    private fun insertcucian(){
        CoroutineScope(Dispatchers.IO).launch {
            db.laundrydao().simpan(
                Laundry(
                    idcuci = 0,
                    binding.inputnamacuci.text.toString(),
                    binding.inputnocuci.text.toString().toInt(),
                    binding.inputberatcuci.text.toString(),
                    binding.inputdetailcuci.text.toString(),
                    binding.inputvariancuci.text.toString()
                )
            )
        }
    }
}