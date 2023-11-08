package com.example.multiplefunction

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val androidActivity = findViewById<CardView>(R.id.android)
        val iosActivity = findViewById<CardView>(R.id.ios)
        val flutterActivity = findViewById<CardView>(R.id.flutter)
        val reactActivity = findViewById<CardView>(R.id.react)
        val webActivity = findViewById<CardView>(R.id.web)
        val machineActivity = findViewById<CardView>(R.id.machine)
        val button = findViewById<Button>(R.id.butContact)

        // Button code here

        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel: " + "01303564615")
            startActivity(intent)
        }

    }
}