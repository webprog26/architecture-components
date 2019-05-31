package com.webprog26.architecturecomponents

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import com.webprog26.architecturecomponents.data.User
import com.webprog26.architecturecomponents.ext.showToast
import com.webprog26.architecturecomponents.handling_lifecycles.LifecyclesActivity
import kotlin.reflect.KClass

class Presenter(val mainView: MainView?) {

    private val mActivityContext: Context? = mainView?.provideActivityContext()?.get()

    fun showToast(user: User) {
        mActivityContext?.showToast("Default user is ${user.name}, ${user.age} years old")
    }

    fun startListActivity(): Unit {
        ListActivity.start(mActivityContext)
    }

    fun startObservableActivity(): Unit {
        ObservableBindingActivity.start(mActivityContext)
    }

    fun startLifecycleActivity(): Unit {
        LifecyclesActivity.start(mActivityContext)
    }
}