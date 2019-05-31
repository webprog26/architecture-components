package com.webprog26.architecturecomponents.handling_lifecycles

import android.util.Log

object Logger {

    private const val TAG = "logger_tag"


    fun log(message: String) {
        Log.i(TAG, message)
    }
}