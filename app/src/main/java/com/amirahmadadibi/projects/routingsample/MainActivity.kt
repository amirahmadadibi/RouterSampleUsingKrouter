package com.amirahmadadibi.projects.routingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.github.denisidoro.krouter.Krouter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStartSecondActivity = findViewById<Button>(R.id.buttonSecond)
        val buttonStartThirdActivity = findViewById<Button>(R.id.buttonThird)



        val krouter = Krouter.from(this, hashMapOf(
                "third/:dataId/user" to ThirdActivity::class.java,
                "second/:id/product" to SecondActivity::class.java
        ))


        buttonStartSecondActivity.setOnClickListener {
            krouter.start("second/10/product")
        }

        buttonStartThirdActivity.setOnClickListener {
            krouter.start("third/100/user")
        }
    }
}