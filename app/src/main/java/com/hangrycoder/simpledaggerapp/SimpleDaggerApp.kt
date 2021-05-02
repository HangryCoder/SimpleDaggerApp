package com.hangrycoder.simpledaggerapp

import android.app.Application
import com.hangrycoder.simpledaggerapp.dagger.CarComponent
import com.hangrycoder.simpledaggerapp.dagger.DaggerCarComponent

class SimpleDaggerApp : Application() {

    private lateinit var component: CarComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerCarComponent.builder()
            .horsePower(120)
            .engineCapacity(1400)
            .build()
    }

    fun getAppComponent() = component
}