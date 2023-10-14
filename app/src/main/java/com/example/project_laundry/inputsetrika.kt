package com.example.project_laundry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project_laundry.ROOM.Laundry2
import com.example.project_laundry.ROOM.database_laundry
import com.example.project_laundry.databinding.ActivityInputsetrikaBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class inputsetrika : AppCompatActivity() {

    private lateinit var binding: ActivityInputsetrikaBinding
    private val db by lazy { database_laundry(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputsetrikaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.inputsetrika.setOnClickListener{
            this.insertsetrika()
        }
    }
    private fun insertsetrika(){
        CoroutineScope(Dispatchers.IO).launch {
            db.laundrydao().simpan2(
                Laundry2(
                    id = 0,
                    binding.inputsetrikanama.text.toString(),
                    binding.inputnosetrika.text.toString().toInt(),
                    binding.inputberatsetrika.text.toString(),
                    binding.inputjenissetrika.text.toString(),
                    binding.inputdetailsetrika.text.toString(),
                    binding.inputpewangisetrika.text.toString()
                )
            )
        }
    }
}