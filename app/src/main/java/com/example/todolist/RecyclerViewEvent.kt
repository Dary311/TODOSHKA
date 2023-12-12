package com.example.todolist
//Интерфейс для обработки событий нажатия в элементе RecyclerView.
interface RecyclerViewEvent {
    fun onItemClick(position: Int)
}