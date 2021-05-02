package com.hangrycoder.simpledaggerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hangrycoder.simpledaggerapp.car.Car
import com.hangrycoder.simpledaggerapp.dagger.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as SimpleDaggerApp).getAppComponent()
            .getActivityComponent(
                DieselEngineModule(horsePower = 120)
            )
        component.inject(this)

        car1.drive()
        car2.drive()
    }
}