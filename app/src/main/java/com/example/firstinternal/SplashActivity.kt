package com.example.firstinternal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var splash = findViewById<ImageView>(R.id.splash)
        splash.alpha = 0f

        splash.animate().setDuration(1500).alpha(1f).withEndAction {
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}