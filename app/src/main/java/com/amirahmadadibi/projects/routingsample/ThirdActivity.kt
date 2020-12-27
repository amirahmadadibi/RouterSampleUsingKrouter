package com.amirahmadadibi.projects.routingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        Toast.makeText(this, "${intent?.getIntExtra("dataId", 0)}", Toast.LENGTH_SHORT).show()

    }
}