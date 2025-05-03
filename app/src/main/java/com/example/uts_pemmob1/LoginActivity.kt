package com.example.uts_pemmob1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnToReister = findViewById<Button>(R.id.btnRegister)
        btnToReister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            Toast.makeText(this, "Login button clicked Success", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}