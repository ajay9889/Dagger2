package com.asystechs.didemo

import dagger.Module
import dagger.Provides

/*Module dependenciese injection*/

@Module
class MemoryCaerdModule {
    @Provides
    fun providesMemoryCard(): MemoryCard{
        return MemoryCard()
    }
}
