package com.hangrycoder.simpledaggerapp.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getActivityComponentBuilder(): ActivityComponent.Builder
}