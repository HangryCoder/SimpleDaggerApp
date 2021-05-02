package com.hangrycoder.simpledaggerapp.dagger

import com.hangrycoder.simpledaggerapp.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {
    fun getDriver(): Driver
}