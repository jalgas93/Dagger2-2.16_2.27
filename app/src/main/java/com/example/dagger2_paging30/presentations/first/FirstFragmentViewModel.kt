package com.example.dagger2_paging30.presentations.first

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import javax.inject.Inject

class FirstFragmentViewModel @Inject constructor():ViewModel() {
    private val infoText = liveData{
         while (true){
             emit(System.currentTimeMillis().toString())
             kotlinx.coroutines.delay(1000)

         }
    }

    val _infoText:LiveData<String> = infoText
}