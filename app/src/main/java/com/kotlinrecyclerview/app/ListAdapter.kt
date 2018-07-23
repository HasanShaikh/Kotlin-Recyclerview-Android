package com.kotlinrecyclerview.app

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Hasan on 20,July,2018
 */
class ListAdapter(private var context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var arrayList: ArrayList<String>? = null


    init {
        arrayList = ArrayList()
        arrayList?.add("hello world")
        arrayList?.add("hello world")
        arrayList?.add("hello world")
        arrayList?.add("hello world")
        arrayList?.add("hello world")
    }

    override fun getItemCount(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return arrayList!!.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val listViewHolder = holder as ListAdapter.ListViewHolder
        listViewHolder.helloText!!.text = arrayList!![position]

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ListAdapter.ListViewHolder(view)
    }


    class ListViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var helloText: TextView? = null

        init {
            helloText = itemView?.findViewById(R.id.text)
        }
    }
}