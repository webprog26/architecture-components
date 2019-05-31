package com.webprog26.architecturecomponents

import android.content.Context
import java.lang.ref.WeakReference

interface MainView {

    fun provideActivityContext() : WeakReference<Context>
}