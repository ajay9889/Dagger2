package com.asystechs.didemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


   /*

   smartPhomne-Depedent { depedency are
        1->MemoryCard,
        2-> Battery
        3.SimCar-->Service provider
    }*/

    private lateinit var smartPhone: SmartPhone;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dependencies injections
        DaggerSmartPhoneComponant.create().getSmartPhone().makeACallWithRecording()

    }
}
