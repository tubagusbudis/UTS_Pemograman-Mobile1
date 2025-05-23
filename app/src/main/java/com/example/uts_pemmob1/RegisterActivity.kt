package com.example.uts_pemmob1

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

//        Deklarasi variabel
        val txtTitle = findViewById<TextView>(R.id.txtTitle)
        val edtName = findViewById<EditText>(R.id.edtName)
        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val imgLogo = findViewById<ImageView>(R.id.imgLogo)

//        Fungsi ketika tombol register di klik
        btnRegister.setOnClickListener {
            val name = edtName.text.toString()
            Log.d("Register", "User registered: $name")
            Toast.makeText(this, "Register button clicked success", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "Your has been registered $name!", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, LoginActivity::class.java))
        }

//        Fungsi untuk mengatur gambar
        val imageView: ImageView = findViewById(R.id.imgLogo)
        Glide.with(this)
            .load(R.drawable.logo_fix)
            .circleCrop()
            .into(imageView)
    }
}