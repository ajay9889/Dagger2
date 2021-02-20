package com.asystechs.didemo

import android.util.Log
import javax.inject.Inject

// dagger doesn't type for dependencie in this way so we need to create mudle dependecies
class NickelCadmiumBatter @Inject constructor(): Battery {
    override fun getPower() {
        Log.i("MYTAG","Power from NickelCadmiumBatter")
    }
}