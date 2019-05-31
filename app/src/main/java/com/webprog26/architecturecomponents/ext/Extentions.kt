package com.webprog26.architecturecomponents.ext

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String, length: Int = Toast.LENGTH_LONG) {
    assert(length == 0 || length == 1)
    Toast.makeText(this, message, length).show()
}