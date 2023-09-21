package com.example.counter

interface CounterView {
    fun showCounter(count : Int)
    fun showToast(message : String)
    fun changeColor(color : Int)
}