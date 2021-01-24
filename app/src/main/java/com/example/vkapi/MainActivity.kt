package com.example.vkapi

import VkApi
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val vkApi = VkApi()
    fun printResponse(){
        val url = vkApi.generateURL("Даниила Мазалецкий")
        val response = vkApi.getResponse(url)
        println(response)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Thread{
            printResponse()
        }.start()



    }
}