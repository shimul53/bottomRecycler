package com.example.recycleviewdemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val itemList = listOf(
            ModelClass("Title 1", "Description 1"),
            ModelClass("Title 2", "Description 2"),
            ModelClass("Title 3", "Description 1"),
            ModelClass("Title 4", "Description 2"),
            ModelClass("Title 5", "Description 1"),
            ModelClass("Title 6", "Description 2"),
            ModelClass("Title 7", "Description 1"),
            ModelClass("Title 8", "Description 2"),
            ModelClass("Title 9", "Description 1"),
            ModelClass("Title 10", "Description 2"),
            ModelClass("Title 11", "Description 1"),
            ModelClass("Title 12", "Description 2"),
            ModelClass("Title 13", "Description 1"),
            ModelClass("Title 14", "Description 2"),
            ModelClass("Title 15", "Description 1"),
            ModelClass("Title 16", "Description 2"),
            ModelClass("Title 17", "Description 1"),
            ModelClass("Title 18", "Description 2"),
            ModelClass("Title 19", "Description 1"),
            ModelClass("Title 20", "Description 2"),
            ModelClass("Title 21", "Description 1"),
            ModelClass("Title 22", "Description 2"),
            ModelClass("Title 23", "Description 1"),
            ModelClass("Title 24", "Description 2"),
            ModelClass("Title 25", "Description 1"),
            // Add more items here
        )

        val adapter = RecyclerViewAdapter(itemList)
        recyclerView.adapter = adapter

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.reverseLayout = false
        linearLayoutManager.stackFromEnd = true
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.scrollToPosition(adapter.itemCount - 1)
        recyclerView.smoothScrollToPosition(adapter.itemCount - 1)
}}