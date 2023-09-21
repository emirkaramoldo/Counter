package com.example.counter

import android.graphics.Color
import android.widget.Toast

class Model() {
    var count = 0
    lateinit var message: Toast
    lateinit var color: Color

    fun increment() {
        ++count
    }

    fun decrement() {
        --count
    }
}