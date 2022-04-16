package com.example.myapplication_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    val isReady = true
    val x = 7
}

class DisplayMessageActivity : AppCompatActivity() {
    val myViewModel by viewModels<MyViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val textView = this.findViewById<TextView>(R.id.textView).apply {
            text = message.toString()
        }
    }
}