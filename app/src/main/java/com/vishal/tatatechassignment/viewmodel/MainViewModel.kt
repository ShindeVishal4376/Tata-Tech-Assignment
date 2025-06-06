package com.vishal.tatatechassignment.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.vishal.tatatechassignment.model.IAVContentData

class MainViewModel: ViewModel() {
    var iavContentData by mutableStateOf(emptyList<IAVContentData>())
        private set

    fun updateIAVContentData(iavContentData: List<IAVContentData>){
        this.iavContentData = iavContentData
    }

    fun getRandomString(length:Int):String{
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}