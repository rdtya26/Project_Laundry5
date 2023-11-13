package com.example.project_laundry.ROOM

import androidx.room.*

@Dao
interface LaundryDAO {
    @Insert
    fun simpan(vararg laundry: Laundry)

    @Update
    fun ubah (vararg laundry: Laundry)


    @Delete
    fun hapus (vararg laundry: Laundry)


    @Query ("Select * From tb_cuci")
    fun getAll(): List<Laundry>


    @Insert
    fun simpan2(vararg laundry2: Laundry2)

    @Update
    fun ubah2(vararg laundry2: Laundry2)

    @Delete
    fun hapus2(vararg laundry2: Laundry2)

   @Query("Select * From tb_setrika")
   fun getAll2(laundry2: Laundry2)

    //Register
    @Insert
    fun simpanregis(vararg register: Register)









}