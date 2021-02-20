package com.asystechs.didemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


   /*
   Logic
   smartPhomne-Depedent { depedency are
        1->MemoryCard,
        2-> Battery
        3.SimCar-->Service provider
    }*/


    @Inject lateinit var smartPhone: SmartPhone;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dependencies injections
//        DaggerSmartPhoneComponant.create().getSmartPhone().makeACallWithRecording()

        DaggerSmartPhoneComponant.create().inject(this)
        // Field injection
        smartPhone.makeACallWithRecording()

    }
}
