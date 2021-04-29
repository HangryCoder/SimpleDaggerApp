package com.hangrycoder.simpledaggerapp

import android.util.Log

class Car(val engine: Engine, val wheels: Wheels) {

    fun drive() {
        Log.d("TAG", "drive")
    }
}