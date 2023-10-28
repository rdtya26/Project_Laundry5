package com.example.project_laundry.ROOM

import android.security.identity.AccessControlProfileId
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity ("TB_AntrianSetrika")
data class Laundry2(
    @PrimaryKey (autoGenerate = true)
    val id : Int,
    @ColumnInfo(name = "Nama")
    val nama : String,
    @ColumnInfo(name = "No_Hp")
    val no : Int,
    @ColumnInfo(name = "Berat")
    val berat : String,
    @ColumnInfo(name = "Detail")
    val detail : String,
    @ColumnInfo(name = "Pewangi")
    val pewangi :String
)
