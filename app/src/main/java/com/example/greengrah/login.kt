package com.example.greengrah
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
class login : AppCompatActivity() {
    private lateinit var editTextNumber1: EditText
    private lateinit var editTextNumber2: EditText
    private lateinit var editTextNumber3: EditText
    private lateinit var editTextNumber4: EditText
    private lateinit var editTextNumber5: EditText
    private lateinit var resultTextView: TextView
    private lateinit var calculateButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editTextNumber1 = findViewById(R.id.editTextNumber)
        editTextNumber2 = findViewById(R.id.editTextNumber2)
        editTextNumber3 = findViewById(R.id.editTextNumber3)
        editTextNumber4 = findViewById(R.id.editTextNumber4)
        editTextNumber5 = findViewById(R.id.editTextNumber5)
        calculateButton = findViewById(R.id.result)

        calculateButton.setOnClickListener {
            val input1 = editTextNumber1.text.toString().toIntOrNull() ?: 0
            val input2 = editTextNumber2.text.toString().toIntOrNull() ?: 0
            val input3 = editTextNumber3.text.toString().toIntOrNull() ?: 0
            val input4 = editTextNumber4.text.toString().toIntOrNull() ?: 0
            val input5 = editTextNumber5.text.toString().toIntOrNull() ?: 0
            val sum = (input1*105)+(input2*103)+(input3*105)+(input4*0.79)
            val sum2:Int
            if (input5>4){
                sum2=input5*4400
            }
            else{
                sum2=input4*1100
            }
            val total=sum+sum2
            calculateButton.text = "Your Carbon Foot Print : $sum2                    Click to Check Methods to Decrese"
            val buttonone=findViewById<Button>(R.id.result)
            buttonone.setOnClickListener{
                val intent = Intent(this, data2::class.java)
                startActivity(intent)
            }

        }
    }
}
