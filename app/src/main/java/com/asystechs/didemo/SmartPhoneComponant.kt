package com.asystechs.didemo

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [MemoryCardModule::class, NcBatterModule::class])
abstract interface SmartPhoneComponant {
    fun inject(mainActivity: MainActivity); // if we have more activity then add like

//    fun getSmartPhone(): SmartPhone
}