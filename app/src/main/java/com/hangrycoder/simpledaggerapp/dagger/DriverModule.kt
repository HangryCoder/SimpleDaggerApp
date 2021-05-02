package com.hangrycoder.simpledaggerapp.dagger

import com.hangrycoder.simpledaggerapp.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DriverModule {
    companion object {
        @Singleton
        @Provides
        fun provideDriver(): Driver {
            return Driver()
        }
    }
}