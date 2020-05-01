package com.example.sopt_hw1_2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et_id = findViewById<EditText>(R.id.et_email)
        val et_pwd = findViewById<EditText>(R.id.et_pwd)
        val btn_login = findViewById<Button>(R.id.btn_login)
        val tv_register = findViewById<TextView>(R.id.tv_register)

        btn_login.setOnClickListener{
            if(et_id.text.isNullOrBlank()||et_pwd.text.isNullOrBlank()) {
                Toast.makeText(this, "아이디와 비밀번호를 확인하세요", Toast.LENGTH_SHORT).show()
            }else{
                val intent2 = Intent(this, MainActivity::class.java)
                startActivity(intent2)
            }
        }
        tv_register.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        val tmp: String? = intent.getStringExtra("check")

        if(tmp.equals("1")) {
            val email = intent.getStringExtra("email")
            val password = intent.getStringExtra("password")
            et_id.setText(email)
            et_pwd.setText(password)
        }
    }
}

