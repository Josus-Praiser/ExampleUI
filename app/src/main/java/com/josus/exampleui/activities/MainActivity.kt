package com.josus.exampleui.activities

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.josus.exampleui.R
import com.josus.exampleui.adapter.FirstListAdapter
import com.josus.exampleui.adapter.SecondListAdapter
import com.josus.exampleui.data.DataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolBar)
        //actionBar?.setDisplayShowTitleEnabled(false)
        //First Recycler View
        val firstListDataSet = DataSource().loadFirstList()
        val firstAdapter = FirstListAdapter(this, firstListDataSet)
        val firstRecyclerView: RecyclerView = findViewById(R.id.firstRecyclerList)

        //Second Recycler View
        val secondListDataSet = DataSource().loadSecondList()
        val secondAdapter = SecondListAdapter(this, secondListDataSet)
        val secondRecyclerView: RecyclerView = findViewById(R.id.secondRecyclerView)

        //First Recycler View- Implementation
        firstRecyclerView.apply {
            adapter = firstAdapter
            setHasFixedSize(true)
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        }

        //Second Recycler View- Implementation
        secondRecyclerView.apply {
            adapter=secondAdapter
            setHasFixedSize(true)
            layoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)
        //return super.onCreateOptionsMenu(menu)
        return true
    }
}