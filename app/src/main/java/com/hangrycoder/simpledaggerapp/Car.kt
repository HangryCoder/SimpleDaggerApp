package com.hangrycoder.simpledaggerapp

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheels) {

    @Inject
    lateinit var engine: Engine

    private val TAG by lazy {
        Car::class.java.simpleName.toString()
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        Log.d(TAG, "Driving")
    }
}