package com.hangrycoder.simpledaggerapp.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    private val TAG by lazy {
        Car::class.java.simpleName.toString()
    }

    fun setListener(car: Car) {
        Log.d(TAG, "Remote connected")
    }

}
