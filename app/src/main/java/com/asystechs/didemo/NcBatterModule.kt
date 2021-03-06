package com.asystechs.didemo

import dagger.Binds
import dagger.Module

// we can directy construct
/*
@Module
 class NcBatterModule {
    @Provides
    fun provideBattery(nickelCadmiumBatter: NickelCadmiumBatter):Battery{
        return nickelCadmiumBatter
    }
}*/

//More consise way we can do

@Module
abstract class NcBatterModule {
    @Binds
    abstract fun provideBattery(nickelCadmiumBattery: NickelCadmiumBattery):Battery
}