package com.example.project_laundry.ROOM

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Laundry::class], [Laundry2::class], version = 1)
abstract class database_laundry : RoomDatabase(){
    abstract fun laundrydao() : LaundryDAO

    companion object{

        @Volatile
        private var instance: database_laundry? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also{
                instance = it
            }
        }

        private fun buildDatabase(context: Context)= Room.databaseBuilder(
            context.applicationContext,database_laundry::class.java,
            "Mugi jaya Laundry"
        ).fallbackToDestructiveMigration().build()


    }
}