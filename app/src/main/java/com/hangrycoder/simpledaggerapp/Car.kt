package com.hangrycoder.simpledaggerapp

import android.util.Log

class Car(val engine: Engine, val wheels: Wheels) {

    private val TAG by lazy {
        Car::class.java.simpleName.toString()
    }

    fun drive() {
        Log.d(TAG, "Driving")
    }
}