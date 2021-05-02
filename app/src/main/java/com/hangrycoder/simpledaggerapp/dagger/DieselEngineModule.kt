package com.hangrycoder.simpledaggerapp.dagger

import com.hangrycoder.simpledaggerapp.car.DieselEngine
import com.hangrycoder.simpledaggerapp.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindEngine(engine: DieselEngine): Engine
}