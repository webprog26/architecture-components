package com.webprog26.architecturecomponents.handling_lifecycles

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.webprog26.architecturecomponents.R

class LifecyclesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycles)

        val tryLifecyclesObserver = TryLifecyclesObserver(lifecycle)
        lifecycle.addObserver(tryLifecyclesObserver)
    }

    companion object {
        fun start(context: Context?) {
            context?.startActivity(Intent(context, LifecyclesActivity::class.java))
        }
    }
}
