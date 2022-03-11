package com.example.mavenpublishexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstlibrary.MyLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(MyLibrary().printHelloWorld())
    }
}