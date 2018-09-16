package com.example.rui.adapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val encount = Encount("ピカチュウ")
        println(encount.infomation())

        val encount2 : Encount2 = NewEncount("ピチュー")
        println(encount2.infomationBase())
        println(encount2.infomationColor())
        println(encount2.infomationPokerus())
    }
}
