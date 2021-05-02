package com.hangrycoder.simpledaggerapp.car

import android.util.Log
import com.hangrycoder.simpledaggerapp.dagger.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(val engine: Engine, val wheels: Wheels, val driver: Driver) {

    private val TAG by lazy {
        Car::class.java.simpleName.toString()
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver drives $this")
    }
}