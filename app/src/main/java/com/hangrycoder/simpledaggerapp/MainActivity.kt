package com.hangrycoder.simpledaggerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val engine = Engine()
        val wheels = Wheels()

        car = Car(engine, wheels)
        car.drive()
    }
}