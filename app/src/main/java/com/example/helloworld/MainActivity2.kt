package com.example.helloworld

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btnSol = findViewById<Button>(R.id.btnSOL)
        btnSol.setOnClickListener { sonido( R.raw.onlineguitartunerg3)}
        var btnMi = findViewById<Button>(R.id.btnMi)
        btnMi.setOnClickListener { sonido() }
        var btnDo = findViewById<Button>(R.id.btnDo)
        btnDo.setOnClickListener { sonido() }
        var btnRe = findViewById<Button>(R.id.btnRe)
        btnRe.setOnClickListener { sonido() }
        var btnFa = findViewById<Button>(R.id.btnFa)
        btnFa.setOnClickListener { sonido() }
        var btnLa = findViewById<Button>(R.id.btnLa)
        btnLa.setOnClickListener { sonido() }
        var btnSi = findViewById<Button>(R.id.btnSi)
        btnSi.setOnClickListener { sonido() }
        var btnSolS = findViewById<Button>(R.id.btnSOLS)
        btnSolS.setOnClickListener { sonido() }
        var btnDoS = findViewById<Button>(R.id.btnDoS)
        btnDoS.setOnClickListener { sonido() }
        var btnFaS = findViewById<Button>(R.id.btnFaS)
        btnFaS.setOnClickListener { sonido() }
        var btnLaS = findViewById<Button>(R.id.btnLaS)
        btnLaS.setOnClickListener { sonido() }
    }
        private fun sonido(nota:R) {
            val mp = MediaPlayer.create(this, nota)
            mp.start()
        }
    }
