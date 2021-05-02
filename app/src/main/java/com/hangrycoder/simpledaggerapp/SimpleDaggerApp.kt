package com.hangrycoder.simpledaggerapp

import android.app.Application
import com.hangrycoder.simpledaggerapp.dagger.AppComponent
import com.hangrycoder.simpledaggerapp.dagger.DaggerAppComponent

class SimpleDaggerApp : Application() {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.create()
    }

    fun getAppComponent() = component
}