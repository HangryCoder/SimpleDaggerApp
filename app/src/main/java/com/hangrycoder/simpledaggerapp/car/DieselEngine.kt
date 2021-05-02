package com.hangrycoder.simpledaggerapp.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() :
    Engine {
    private val TAG = "Car"

    override fun start() {
        Log.d(TAG, "Diesel Engine started")
    }
}