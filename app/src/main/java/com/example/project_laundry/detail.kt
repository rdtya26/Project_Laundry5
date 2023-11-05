package com.example.project_laundry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class detail : AppCompatActivity() {

    open var detail: Any? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

    }
}