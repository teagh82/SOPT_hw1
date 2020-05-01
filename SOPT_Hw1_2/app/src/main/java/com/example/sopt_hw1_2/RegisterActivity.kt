package com.example.sopt_hw1_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val et_id = findViewById<EditText>(R.id.et_id)
        val et_pwd = findViewById<EditText>(R.id.et_pass)
        val et_pwd2 = findViewById<EditText>(R.id.et_pass2)
        val btn_register = findViewById<Button>(R.id.btn_register)

        btn_register.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            if(et_pwd.text.toString().equals(et_pwd2.text.toString())) {
                intent.putExtra("check", "1")
                intent.putExtra("email", et_id.text.toString())
                intent.putExtra("password", et_pass.text.toString())
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this, "비밀번호를 다시 확인하세요", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

