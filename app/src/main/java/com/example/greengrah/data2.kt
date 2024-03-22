package com.example.greengrah
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class data2 : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data2)
        val imageButton = findViewById<ImageButton>(R.id.imageButton1)
        imageButton.setOnClickListener {
            val url = "https://www.iisd.org/articles/deep-dive/road-sustainable-transport"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val imageButton1 = findViewById<ImageButton>(R.id.imageButton2)
        imageButton1.setOnClickListener {
            val url = "https://www.wartsila.com/energy/sustainable-fuels/introduction"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton3)
        imageButton2.setOnClickListener {
            val url = "https://www.frontiersin.org/articles/10.3389/fpsyg.2020.01603/full"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val imageButton3 = findViewById<ImageButton>(R.id.imageButton4)
        imageButton3.setOnClickListener {
            val url = "https://www.shaktiplasticinds.com/how-recycled-plastic-can-help-in-reducing-carbon-footprint/#:~:text=By%20recycling%20plastic%20waste%2C%20we,to%20a%20more%20sustainable%20future."
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val button7=findViewById<Button>(R.id.butt9)
        button7.setOnClickListener{
            val intent = Intent(this, talk::class.java)
            startActivity(intent)
        }

    }
}