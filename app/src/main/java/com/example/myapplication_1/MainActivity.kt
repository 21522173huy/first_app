package com.example.myapplication_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.EditText
import android.widget.Button as Button1
import org.w3c.dom.Text
const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSGAE"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun sendmessage(view: View) {
            val editText =  findViewById<EditText>(R.id.editTextTextPersonName)
            val message = editText.text.toString()
            val intent = Intent(this, DisplayMessageActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
            startActivity(intent)
        }
    }

    fun sendmessage(view: View) {}
}