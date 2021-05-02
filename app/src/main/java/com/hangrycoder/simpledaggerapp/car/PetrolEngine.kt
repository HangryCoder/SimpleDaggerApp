package com.hangrycoder.simpledaggerapp.car

import android.util.Log
import com.hangrycoder.simpledaggerapp.car.Engine
import javax.inject.Inject

class PetrolEngine @Inject constructor() :
    Engine {
    private val TAG = "Car"

    override fun start() {
        Log.d(TAG, "Petrol Engine started")
    }
}