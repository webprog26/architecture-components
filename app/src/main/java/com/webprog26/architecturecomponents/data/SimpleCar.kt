package com.webprog26.architecturecomponents.data

import android.databinding.ObservableField
import android.databinding.ObservableFloat
import android.databinding.ObservableInt

class SimpleCar {
  val title = ObservableField<String>()
  val engineVolume = ObservableFloat()
  val maxSpeedInKm = ObservableInt()
}