package com.asystechs.didemo

import dagger.Component

@Component (modules = [MemoryCaerdModule::class])
abstract interface SmartPhoneComponant {

    fun getSmartPhone(): SmartPhone
}