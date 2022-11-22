package com.example.helloworld

import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import java.io.IOException
import kotlin.math.log

class MainActivity2 : AppCompatActivity() {
    private var mediaPlayer : MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btnMi = findViewById<Button>(R.id.btnMi)
        btnMi.setOnClickListener{Sonido()}
    }

    private fun Sonido() {
        playNote()
    }

    private fun playNote() {
        val audioUrl="http://www.sonidosmp3gratis.com/sounds/online-guitar-tuner-g3-.mp3"
        mediaPlayer = MediaPlayer()
        mediaPlayer!!.setAudioStreamType(AudioManager.STREAM_MUSIC)
        try {
            print("esta activa esta opcion")
            mediaPlayer!!.setDataSource(audioUrl)
            mediaPlayer!!.prepare()
            mediaPlayer!!.start()
        }catch (e: IOException){
            e.printStackTrace()
            print("a fallado")
        }
        Toast.makeText(this,"comienza a sonar", Toast.LENGTH_SHORT).show()

    }
}