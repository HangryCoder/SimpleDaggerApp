package com.hangrycoder.simpledaggerapp.car

import android.util.Log
import com.hangrycoder.simpledaggerapp.car.Engine
import javax.inject.Inject

class PetrolEngine @Inject constructor(private val horsePower: Int) :
    Engine {
    private val TAG = "Car"

    override fun start() {
        Log.d(TAG, "Petrol Engine started horsePower: $horsePower")
    }
}