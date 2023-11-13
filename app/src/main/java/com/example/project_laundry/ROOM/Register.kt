package com.example.project_laundry.ROOM

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "register")
data class Register (
    @PrimaryKey
    val username : String,
    val email : String,
    val password : String
        )
