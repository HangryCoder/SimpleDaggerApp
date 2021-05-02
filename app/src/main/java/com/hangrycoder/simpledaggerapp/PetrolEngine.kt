package com.hangrycoder.simpledaggerapp

import android.util.Log

class PetrolEngine : Engine {
    private val TAG = "Car"

    override fun start() {
        Log.d(TAG, "Petrol Engine started")
    }
}