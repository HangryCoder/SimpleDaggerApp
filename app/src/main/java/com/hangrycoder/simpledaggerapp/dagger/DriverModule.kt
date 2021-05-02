package com.hangrycoder.simpledaggerapp.dagger

import com.hangrycoder.simpledaggerapp.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule(private val driverName: String) {

    @Singleton
    @Provides
    fun provideDriver(): Driver {
        return Driver(driverName)
    }
}