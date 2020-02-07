package com.example.rnechita.testsubmoduleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import hello.HelloManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        HelloManager.sayHello("Rares")
        Log.d("DebugTest", "Result:${HelloManager.add(1 ,2)}")
    }
}
