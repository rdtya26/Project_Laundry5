package com.example.project_laundry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {

    var et_user = findViewById<EditText>(R.id.hintuser)
    var et_pass = findViewById<EditText>(R.id.hintpass)
    var btnlogin = findViewById<Button>(R.id.login)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


            btnlogin.setOnClickListener {
                var username = et_user
                var password = et_pass
                Toast.makeText(this@login, "username", Toast.LENGTH_SHORT)
                    .show()

                if (username.getText().toString().length == 0) {
                    //jika username kosong
                    username.setError("mohon isi username!!")
                } else
                    if (password.getText().toString().length == 0) {
                        //jika password kosong
                        password.setError("mohon isi password!!")
                    }


            }


        }
    }

