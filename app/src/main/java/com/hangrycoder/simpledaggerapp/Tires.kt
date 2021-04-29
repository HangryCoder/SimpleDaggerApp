package com.hangrycoder.simpledaggerapp

import android.util.Log

class Tires {

    private val TAG by lazy {
        Car::class.java.simpleName.toString()
    }

    fun inflate() {
        Log.d(TAG, "Tires inflated")
    }
}
