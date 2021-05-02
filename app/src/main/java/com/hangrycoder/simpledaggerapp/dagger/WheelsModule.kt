package com.hangrycoder.simpledaggerapp.dagger

import com.hangrycoder.simpledaggerapp.car.Rims
import com.hangrycoder.simpledaggerapp.car.Tires
import com.hangrycoder.simpledaggerapp.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    companion object {
        @Provides
        fun provideRims(): Rims {
            return Rims()
        }

        @Provides
        fun providesTires(): Tires {
            return Tires().apply {
                inflate()
            }
        }

        @Provides
        fun providesWheels(rims: Rims, tires: Tires): Wheels {
            return Wheels(rims, tires)
        }
    }
}