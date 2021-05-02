package com.hangrycoder.simpledaggerapp.dagger

import com.hangrycoder.simpledaggerapp.car.Engine
import com.hangrycoder.simpledaggerapp.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}