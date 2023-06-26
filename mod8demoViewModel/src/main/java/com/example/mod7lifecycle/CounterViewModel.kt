package com.example.mod7lifecycle

import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private var counter : Int = 0

    fun increment() : Int{
        //incrémente et renvoie
        return ++counter
    }

    fun getCounter() : Int {
        return counter
    }
}