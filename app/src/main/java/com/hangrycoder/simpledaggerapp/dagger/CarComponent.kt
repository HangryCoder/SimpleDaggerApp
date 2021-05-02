package com.hangrycoder.simpledaggerapp.dagger

import com.hangrycoder.simpledaggerapp.MainActivity
import com.hangrycoder.simpledaggerapp.car.Car
import dagger.BindsInstance
import dagger.Component

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(horsePower: Int): Builder
        fun build(): CarComponent
    }
}