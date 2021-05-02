package com.hangrycoder.simpledaggerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hangrycoder.simpledaggerapp.car.Car
import com.hangrycoder.simpledaggerapp.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerActivityComponent.builder()
            .horsePower(120)
            .engineCapacity(1400)
            .appComponent((application as SimpleDaggerApp).getAppComponent())
            .build()

        component.inject(this)

        car1.drive()
        car2.drive()
    }
}