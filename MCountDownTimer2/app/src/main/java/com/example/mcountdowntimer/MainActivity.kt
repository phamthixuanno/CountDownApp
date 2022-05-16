package com.example.mcountdowntimer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.skyfishjy.library.RippleBackground
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        //ripple
        val rippleBackground = findViewById(R.id.content) as RippleBackground
        val butView: Button = findViewById(R.id.buttonIntent) as Button
        butView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                rippleBackground.startRippleAnimation()
            }
        })

        //operation of button
        buttonIntent.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}