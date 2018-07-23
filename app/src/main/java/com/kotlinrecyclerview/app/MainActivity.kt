package com.kotlinrecyclerview.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val message = "Hello world Kotlin"
    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeView()
    }

    fun initializeView() {
        recyclerView = rv
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView!!.layoutManager = linearLayoutManager
        val listAdapter = ListAdapter(this)
        recyclerView?.adapter = listAdapter
    }
}

