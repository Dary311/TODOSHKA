package com.example.todolist

import androidx.room.Entity
import androidx.room.PrimaryKey
// Класс данных, представляющий модель задачи.
@Entity
data class Todo(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val title: String,
    var isChecked:Boolean = false
)
