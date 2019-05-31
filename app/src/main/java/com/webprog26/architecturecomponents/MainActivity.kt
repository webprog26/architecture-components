package com.webprog26.architecturecomponents

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.webprog26.architecturecomponents.data.User
import com.webprog26.architecturecomponents.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ref.WeakReference

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        val user = User("Kuma", 23)
        val presenter = Presenter(this)
        binding.setVariable(BR.user, user)
        binding.setVariable(BR.presenter, presenter)
        binding.executePendingBindings()
        btn_start_list_activity.setOnClickListener { presenter.startListActivity() }
        btn_start_observable_activity.setOnClickListener { presenter.startObservableActivity() }
        btn_start_lifecycle_activity.setOnClickListener { presenter.startLifecycleActivity() }

    }

    override fun provideActivityContext(): WeakReference<Context> {
        return WeakReference(this)
    }

}
