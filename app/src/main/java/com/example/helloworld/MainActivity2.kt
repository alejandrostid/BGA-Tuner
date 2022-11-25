package com.example.helloworld

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btnSol = findViewById<Button>(R.id.btnSolS)
        btnSol.setOnClickListener { sonido(R.raw.onlineguitartunerg3)}
        var btnMi = findViewById<Button>(R.id.btnMi)
        btnMi.setOnClickListener { sonido(R.raw.onlineguitartunere2) }
        var btnDo = findViewById<Button>(R.id.btnDo)
        //btnDo.setOnClickListener { sonido()}
        var btnRe = findViewById<Button>(R.id.btnRe)
        btnRe.setOnClickListener { sonido(R.raw.onlineguitartunerd3) }
        var btnFa = findViewById<Button>(R.id.btnFa)
        //btnFa.setOnClickListener { sonido()}
        var btnLa = findViewById<Button>(R.id.btnLa)
        btnLa.setOnClickListener { sonido(R.raw.onlineguitartunera2) }
        var btnSi = findViewById<Button>(R.id.btnSi)
        btnSi.setOnClickListener { sonido(R.raw.onlineguitartunerb3) }
        var btnSolS = findViewById<Button>(R.id.btnSOL)
        btnSolS.setOnClickListener { sonido(R.raw.guitarraafinarcuerdatres) }
        var btnDoS = findViewById<Button>(R.id.btnDoS)
        //btnDoS.setOnClickListener { sonido() }
        var btnFaS = findViewById<Button>(R.id.btnFaS)
        //btnFaS.setOnClickListener { sonido() }
        var btnLaS = findViewById<Button>(R.id.btnLaS)
        //btnLaS.setOnClickListener { sonido() }

        var btnMi6 = findViewById<Button>(R.id.btnMi6)
        btnMi6.setOnClickListener { sonido(R.raw.guitarraafinarcuerdaseis) }

        var frecuencia = findViewById<Button>(R.id.frecuencia)
        frecuencia.setOnClickListener{ val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        }
    }
        private fun sonido(nota: Int) {
            val mp = MediaPlayer.create(this, nota)
            mp.start()
        }
    }
