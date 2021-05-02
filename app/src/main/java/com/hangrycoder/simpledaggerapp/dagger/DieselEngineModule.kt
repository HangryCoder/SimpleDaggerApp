package com.hangrycoder.simpledaggerapp.dagger

import com.hangrycoder.simpledaggerapp.car.DieselEngine
import com.hangrycoder.simpledaggerapp.car.Engine
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class DieselEngineModule @Inject constructor(private val horsePower: Int) {

    @Provides
    fun providesEngine(): Engine {
        return DieselEngine(horsePower)
    }
}