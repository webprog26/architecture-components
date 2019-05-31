package com.webprog26.architecturecomponents.handling_lifecycles

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent

class TryLifecyclesObserver(private val lifecycle: Lifecycle) : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreated() {
        Logger.log("created")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStarted() {
        if (lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)) {
            Logger.log("started")
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumed() {
        Logger.log("resumed")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPaused() {
        Logger.log("paused")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopped() {
        Logger.log("stopped")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroyed() {
        if (lifecycle.currentState.isAtLeast(Lifecycle.State.DESTROYED)) {
            Logger.log("destroyed")
        }
    }


}