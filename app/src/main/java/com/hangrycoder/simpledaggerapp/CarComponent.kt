package com.hangrycoder.simpledaggerapp

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}