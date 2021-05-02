package com.hangrycoder.simpledaggerapp

import android.app.Application
import com.hangrycoder.simpledaggerapp.dagger.AppComponent

class SimpleDaggerApp : Application() {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerCarComponent.builder()
            .horsePower(120)
            .engineCapacity(1400)
            .build()
    }

    fun getAppComponent() = component
}