package com.example.greengrah

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Switch

class data3 : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "UseSwitchCompatOrMaterialCode", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data3)
        val Button1 = findViewById<Button>(R.id.bu1)
        Button1.setOnClickListener {
            val url = "https://missionlife-moefcc.nic.in/reduce-waste-index.php"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val Button2 = findViewById<Button>(R.id.bu2)
        Button2.setOnClickListener {
            val url = "https://missionlife-moefcc.nic.in/save-energy-index.php"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val Button3 = findViewById<Button>(R.id.bu3)
        Button3.setOnClickListener {
            val url = "https://missionlife-moefcc.nic.in/sup-index.php"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val Button4 = findViewById<Button>(R.id.bu4)
        Button4.setOnClickListener {
            val url = "https://missionlife-moefcc.nic.in/save-water-index.php"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val Button5 = findViewById<Button>(R.id.bu5)
        Button5.setOnClickListener {
            val url = "https://missionlife-moefcc.nic.in/asfs-index.php"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

    }
}