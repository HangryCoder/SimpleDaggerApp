package com.hangrycoder.simpledaggerapp.dagger

import com.hangrycoder.simpledaggerapp.car.Driver
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getDriver(): Driver
}