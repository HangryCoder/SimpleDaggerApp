package com.hangrycoder.simpledaggerapp

import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun providesEngine(engine: PetrolEngine): Engine {
        return engine
    }
}