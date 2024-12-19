package com.yehiacompany.FacebookApp.codeKotlin.intro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.yehiacompany.FacebookApp.codeKotlin.main.FacebookTimeLineActivity
import com.yehiacompany.FacebookApp.R

class Login : AppCompatActivity() {

    lateinit var btnLogin :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin = findViewById(R.id.Btn_Login)

        btnLogin.setOnClickListener {
            var intent = Intent(this , FacebookTimeLineActivity :: class.java)
            startActivity(intent)
        }



    }
}