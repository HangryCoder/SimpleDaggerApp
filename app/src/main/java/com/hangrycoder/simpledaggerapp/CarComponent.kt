package com.hangrycoder.simpledaggerapp

import dagger.Component

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(activity: MainActivity)
}