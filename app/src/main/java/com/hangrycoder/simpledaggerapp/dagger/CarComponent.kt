package com.hangrycoder.simpledaggerapp.dagger

import com.hangrycoder.simpledaggerapp.MainActivity
import com.hangrycoder.simpledaggerapp.car.Car
import dagger.Component

@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(activity: MainActivity)
}