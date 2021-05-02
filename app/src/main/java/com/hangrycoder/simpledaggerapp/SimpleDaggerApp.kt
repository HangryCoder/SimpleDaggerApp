package com.hangrycoder.simpledaggerapp

import android.app.Application
import com.hangrycoder.simpledaggerapp.dagger.AppComponent
import com.hangrycoder.simpledaggerapp.dagger.DaggerAppComponent
import com.hangrycoder.simpledaggerapp.dagger.DriverModule

class SimpleDaggerApp : Application() {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.factory().create(DriverModule("Sonia"))
    }

    fun getAppComponent() = component
}