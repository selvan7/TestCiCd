package com.example.testcicd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "New Commit Test7 CI/CD  !!!", Toast.LENGTH_LONG).show()
    }
}