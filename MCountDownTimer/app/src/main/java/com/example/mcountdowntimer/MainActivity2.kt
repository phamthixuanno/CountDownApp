package com.example.mcountdowntimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn_send:Button = findViewById(R.id.btn_send)
        btn_send.setOnClickListener {

            val mySeekbarDialog = CustomSeekbar()
            mySeekbarDialog.show(supportFragmentManager, "")
        }
    }
}