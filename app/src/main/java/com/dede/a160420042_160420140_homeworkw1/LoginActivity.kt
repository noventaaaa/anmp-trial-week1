package com.dede.a160420042_160420140_homeworkw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

var data_user = arrayOf(
    User(
        1,"Noven","12345678"
    ),
    User(
        2,"Dedek","87654321"
    )
)

class LoginActivity : AppCompatActivity() {
    companion object{
        var USER_NAME = "USER_NAME"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btnLogin.setOnClickListener {
            var name = txtName.text.toString()
            var pass = txtPassword.text.toString()
            for(data in data_user.indices){
                if (name == data_user[data].name && pass == data_user[data].password){
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra(USER_NAME,name.toString())
                    startActivity(intent)
                    lblNotification.text = "..."
                }
                else{
                    lblNotification.text = "Maaf kamu bukan kelompok kami :("
                }
            }
        }


    }
}