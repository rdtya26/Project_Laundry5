package com.example.project_laundry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val cuci: ImageButton = findViewById(R.id.imgcuci)
        val setrika: ImageButton = findViewById(R.id.imgsetrika)


        cuci.setOnClickListener {
            Toast.makeText(this, "cuci button", Toast.LENGTH_SHORT).show()
        }
        setrika.setOnClickListener {
            Toast.makeText(this, "setrika button", Toast.LENGTH_SHORT).show()
        }


    }
}