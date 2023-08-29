package com.dede.a160420042_160420140_homeworkw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

var data_user = arrayOf(
    User(
        1,"Noven","12345678"
    ),
    User(
        2,"Dedek","87654321"
    )
)
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


    }
}