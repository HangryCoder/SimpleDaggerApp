package com.hangrycoder.simpledaggerapp.dagger

import com.hangrycoder.simpledaggerapp.MainActivity
import com.hangrycoder.simpledaggerapp.car.Car
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, PetrolEngineModule::class]
)
interface ActivityComponent {
    fun getCar(): Car

    fun inject(activity: MainActivity)

     @Subcomponent.Builder
     interface Builder {

         @BindsInstance
         fun horsePower(@Named("horsePower") horsePower: Int): Builder

         @BindsInstance
         fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

         fun build(): ActivityComponent
     }
}