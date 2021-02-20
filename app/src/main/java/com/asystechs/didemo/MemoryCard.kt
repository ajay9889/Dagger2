package com.asystechs.didemo

import android.util.Log
import javax.inject.Inject

/*
Lets say this is from thrid party library*
In this case we cannot use @inject constructor()
/
 */
class MemoryCard {
    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }
}