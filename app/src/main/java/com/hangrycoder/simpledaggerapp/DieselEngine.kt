package com.hangrycoder.simpledaggerapp

import android.util.Log

class DieselEngine : Engine {
    private val TAG = "Car"

    override fun start() {
        Log.d(TAG, "Diesel Engine started")
    }
}