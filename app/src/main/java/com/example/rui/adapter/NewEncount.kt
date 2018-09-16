package com.example.rui.adapter

import java.util.*

class NewEncount(name: String) : Encount(name), Encount2 {
    val num = Random().nextInt(65536)
    override fun infomationBase(): String {
        return infomation()
    }
    override fun infomationColor(): String {
        return if(num.rem(8192) == 0) "この $name は色違いです" else "この $name は普通の色です"
    }
    override fun infomationPokerus(): String{
        return if(num.rem(218845) == 0) "この $name はポケルスに感染しています" else "この $name はポケルスに感染していません"
    }
}