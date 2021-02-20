package com.asystechs.didemo

import android.util.Log
import dagger.Module
import dagger.Provides

/*Module dependenciese injection*/

@Module
class MemoryCardModule(var paramValue: Int) {
    @Provides
    fun providesMemoryCard(): MemoryCard{
        Log.i("MYTAG","MemoryCardModule started at ${paramValue}")
        return MemoryCard()
    }
}
