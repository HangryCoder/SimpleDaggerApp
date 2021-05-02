package com.hangrycoder.simpledaggerapp.car

import com.hangrycoder.simpledaggerapp.car.Rims
import com.hangrycoder.simpledaggerapp.car.Tires

//We don't own this class. So we cannot annotate it with @Inject
class Wheels(val rims: Rims, val tires: Tires) {
}