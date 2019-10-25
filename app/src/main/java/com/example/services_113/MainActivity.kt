package com.example.services_113

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_fb.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/langitinspirasi"))
        startActivity(i)
        }

        iv_ig.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.instagram.com/langitinspirasi.co.id"))
        startActivity(i)
        }

        var MediaPlayer : MediaPlayer? = MediaPlayer.create(this,R.raw.bruno)

        iv_play.setOnClickListener{
            MediaPlayer?.start()
        }
        iv_pause.setOnClickListener{
            MediaPlayer?.pause()
        }
        iv_stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
