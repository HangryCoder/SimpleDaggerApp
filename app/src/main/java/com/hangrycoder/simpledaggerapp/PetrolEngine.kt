package com.hangrycoder.simpledaggerapp

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {
    private val TAG = "Car"

    override fun start() {
        Log.d(TAG, "Petrol Engine started")
    }
}