package com.example.greengrah
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonzero=findViewById<Button>(R.id.bot)
        buttonzero.setOnClickListener{
            val intent = Intent(this, talk::class.java)
            startActivity(intent)
        }
        val buttonone=findViewById<Button>(R.id.test1)
        buttonone.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        val button2=findViewById<Button>(R.id.life1)
        button2.setOnClickListener{
            val intent = Intent(this, data3::class.java)
            startActivity(intent)
        }
        val button3=findViewById<Button>(R.id.news1)
        button3.setOnClickListener{
            val intent = Intent(this, news::class.java)
            startActivity(intent)
        }

    }
}
