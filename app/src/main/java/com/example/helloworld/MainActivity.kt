package com.example.helloworld

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnOir = findViewById<Button>(R.id.btnOir)
        btnOir.setOnClickListener { checkPermissions() }
        var btnpass = findViewById<Button>(R.id.button2)
        btnpass.setOnClickListener {
            val inert = Intent(this, MainActivity2::class.java)
            startActivity(inert)
        }
    }
        private fun checkPermissions(){
            if(ContextCompat.checkSelfPermission(this, android.Manifest.permission.RECORD_AUDIO)!=PackageManager.PERMISSION_GRANTED){
                requestPermissions()
            }else{
                openMicrofono()
            }
        }

    private fun openMicrofono() {
        Toast.makeText(this,"open microfone",Toast.LENGTH_SHORT).show()
    }

    private fun requestPermissions(){
        if(ActivityCompat.shouldShowRequestPermissionRationale(this,android.Manifest.permission.RECORD_AUDIO)){
            Toast.makeText(this,"Denegte Permissions",Toast.LENGTH_SHORT).show()
        }else{
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.RECORD_AUDIO),777)

        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode === 777){
            if(grantResults.isNotEmpty()&& grantResults[0] == PackageManager.PERMISSION_GRANTED){
                openMicrofono()
            }
        }else{
            Toast.makeText(this,"Denegte firt times",Toast.LENGTH_SHORT).show()
        }
    }
}