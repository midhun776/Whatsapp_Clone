package com.example.firstinternal

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.firstinternal.model.SampleData

class StatusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status)

        val i = intent
        val pos = i.getIntExtra("statusPos",0)

        val img = findViewById<ImageView>(R.id.img_statusView)
        img.setImageResource(SampleData.statusDemo[pos].status)

        img.animate().setDuration(1200).alpha(1f).withEndAction {
            finish()
        }
    }
}