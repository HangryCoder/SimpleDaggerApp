package com.hangrycoder.simpledaggerapp.dagger

import com.hangrycoder.simpledaggerapp.MainActivity
import com.hangrycoder.simpledaggerapp.car.Car
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, DieselEngineModule::class]
)
interface ActivityComponent {
    fun getCar(): Car

    fun inject(activity: MainActivity)

    /* @Component.Builder
     interface Builder {

         @BindsInstance
         fun horsePower(@Named("horsePower") horsePower: Int): Builder

         @BindsInstance
         fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

         fun appComponent(component: AppComponent): Builder

         fun build(): ActivityComponent
     }*/
}