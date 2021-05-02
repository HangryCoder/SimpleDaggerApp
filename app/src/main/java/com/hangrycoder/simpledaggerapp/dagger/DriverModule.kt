package com.hangrycoder.simpledaggerapp.dagger

import com.hangrycoder.simpledaggerapp.car.Driver
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class DriverModule {

    @Binds
    @Singleton
    abstract fun bindDriver(driver: Driver): Driver
}