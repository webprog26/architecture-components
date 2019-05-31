package com.webprog26.architecturecomponents

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.webprog26.architecturecomponents.data.User
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        recycler_view.layoutManager = LinearLayoutManager(this)
        val users = listOf<User>(User("James", 32), User("Ann", 25))
        val adapter = ListAdapter(users)
        recycler_view.adapter = adapter
    }

    companion object {

        fun start(context: Context?) {
            context?.startActivity(Intent(context, ListActivity::class.java))
        }
    }
}
