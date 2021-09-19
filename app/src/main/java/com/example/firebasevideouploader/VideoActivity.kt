package com.example.firebasevideouploader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class VideoActivity : AppCompatActivity() {
    lateinit var addVideoFAB: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)

        addVideoFAB = findViewById(R.id.addVideoFAB)
        addVideoFAB.setOnClickListener{
            startActivity(Intent(this, AddVideoActivity::class.java))
        }


    }
}