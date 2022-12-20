package com.example.testcicd

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "New Test777 CI/CD test1  !!!", Toast.LENGTH_LONG).show()
        AppCenter.start(
            application, "28c5fd8d-d1bf-4603-9ab9-15b4ba85b085",
            Analytics::class.java, Crashes::class.java
        )

    }
}