package com.hangrycoder.simpledaggerapp.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) :
    Engine {
    private val TAG = "Car"

    override fun start() {
        Log.d(TAG, "Diesel Engine started horsePower: $horsePower")
    }
}