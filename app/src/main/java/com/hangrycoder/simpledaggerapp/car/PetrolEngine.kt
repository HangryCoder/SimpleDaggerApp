package com.hangrycoder.simpledaggerapp.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horsePower") private val horsePower: Int,
    @Named("engineCapacity") private val engineCapacity: Int
) :
    Engine {
    private val TAG = "Car"

    override fun start() {
        Log.d(
            TAG,
            "Petrol Engine started\nHorsePower: $horsePower\nEngineCapacity: $engineCapacity"
        )
    }
}