package com.example.myapplication_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val message = intent.getStringArrayExtra(EXTRA_MESSAGE)
        val textView = this.findViewById<TextView>(R.id.textView).apply {
            text = "xyz"
        }
    }
}