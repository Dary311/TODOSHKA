package com.example.todolist

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//Класс базы данных Room для хранения задач.

@Database(entities = [Todo::class], version = 1)
abstract class TodoDatabase : RoomDatabase() {
    abstract val dao: TodoDao

    companion object {
        @Volatile
        private var instance: TodoDatabase? = null
        //Получает экземпляр базы данных
        fun getInstance(context: Context) : TodoDatabase {
            synchronized(this) {
                return instance ?:
                Room.databaseBuilder(
                    context,
                    TodoDatabase::class.java,
                    "todo_db"
                ).build().also {
                    instance = it
                }
            }
        }
    }
}