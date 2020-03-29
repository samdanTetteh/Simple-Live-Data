package com.example.simplelivedata

import android.app.Application
import android.graphics.Color
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import java.util.*

class ViewModel(application: Application) : AndroidViewModel(application) {

    val color = MutableLiveData<Int>()



    fun getRandomColor(){
        val random = Random()
        val randomColor = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        color.value = randomColor
    }

}