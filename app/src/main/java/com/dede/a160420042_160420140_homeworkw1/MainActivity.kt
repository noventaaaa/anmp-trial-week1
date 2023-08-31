package com.dede.a160420042_160420140_homeworkw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object{
        var USER_NAME = "USER_NAME"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var members = intent.getStringExtra(LoginActivity.USER_NAME).toString()
    }
}

