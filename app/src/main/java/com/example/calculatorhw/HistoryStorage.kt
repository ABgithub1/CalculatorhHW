package com.example.calculatorhw

object HistoryStorage {
    val historyList = mutableListOf<String>()

    fun addToHistory(string: String){
        historyList.add(string)
    }
}