package com.webprog26.architecturecomponents

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.webprog26.architecturecomponents.data.SimpleCar
import com.webprog26.architecturecomponents.databinding.ActivityObservableBindingBinding
import kotlinx.android.synthetic.main.activity_observable_binding.*

class ObservableBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityObservableBindingBinding = DataBindingUtil
            .setContentView(this, R.layout.activity_observable_binding)
        binding.lifecycleOwner = this
        fbtn_send.setOnClickListener {
            val newCarTitle = et_car_name.text.toString()
            val newSimpleCar = SimpleCar()
            newSimpleCar.title.set(newCarTitle)
            newSimpleCar.engineVolume.set(1.6F)
            newSimpleCar.maxSpeedInKm.set(220)
            binding.setVariable(BR.car, newSimpleCar)
            binding.executePendingBindings()

            hideKeyboard()
            et_car_name.text = null
        }
    }

    companion object {

        fun start(context: Context?) {
            context?.startActivity(Intent(context, ObservableBindingActivity::class.java))
        }
    }

    private fun hideKeyboard() {
        val inputManagerService = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        var focusedView : View? = currentFocus

        if (focusedView != null) {
            focusedView = View(this)
        }
        inputManagerService.hideSoftInputFromWindow(focusedView?.windowToken, 0)
    }
}
