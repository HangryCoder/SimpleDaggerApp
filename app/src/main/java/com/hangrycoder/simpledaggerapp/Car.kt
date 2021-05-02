package com.hangrycoder.simpledaggerapp

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheels: Wheels) {

    private val TAG by lazy {
        Car::class.java.simpleName.toString()
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "Driving")
    }
}