package com.asystechs.didemo

import android.app.Application

class SmartPhoneApplication: Application() {
    lateinit var smartPhoneComponant: SmartPhoneComponant
    override fun onCreate() {
        smartPhoneComponant =initDagger()
        super.onCreate()

    }

    private fun initDagger() : SmartPhoneComponant= DaggerSmartPhoneComponant.builder().
    memoryCardModule(MemoryCardModule(1000)).
    build()
}