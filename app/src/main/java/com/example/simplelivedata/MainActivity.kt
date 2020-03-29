package com.example.simplelivedata

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        viewModel = ViewModelProvider(this).get(ViewModel::class.java)
        viewModel.color.observe(this, Observer {
            color_holder.setBackgroundColor(it)
        })


        viewModel.getRandomColor()

        fab.setOnClickListener { view ->
           viewModel.getRandomColor()
        }
    }


}
