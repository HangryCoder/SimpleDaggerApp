package com.hangrycoder.simpledaggerapp

import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindEngine(engine: DieselEngine): Engine
}