package com.hangrycoder.simpledaggerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hangrycoder.simpledaggerapp.car.Car
import com.hangrycoder.simpledaggerapp.dagger.DaggerCarComponent
import com.hangrycoder.simpledaggerapp.dagger.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(100))
            .build()

        carComponent.inject(this)
        car.drive()
    }
}