package com.example.keretaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ulwan.xmllatihan.MainActivity
import com.ulwan.xmllatihan.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvForgotPassword = findViewById<TextView>(R.id.tvForgotPassword)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Email atau password tidak boleh kosong", Toast.LENGTH_SHORT).show()
            } else {
                // Lakukan login (contoh validasi sederhana)
                if (email == "user@example.com" && password == "password123") {
                    Toast.makeText(this, "Login berhasil", Toast.LENGTH_SHORT).show()
                    // Pindah ke halaman utama
                    startActivity(Intent(this, MainActivity::class.java))
                } else {
                    Toast.makeText(this, "Email atau password salah", Toast.LENGTH_SHORT).show()
                }
            }
        }

        tvForgotPassword.setOnClickListener {
            Toast.makeText(this, "Fitur lupa password belum tersedia", Toast.LENGTH_SHORT).show()
        }
    }
}
