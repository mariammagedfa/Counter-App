package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var player1 = 0
    private var player2 = 0

    var textviewzero1: TextView = findViewById<TextView>(R.id.textzero1)
    var textviewzero2: TextView = findViewById<TextView>(R.id.textzero2)

    private val button1: Button = findViewById<Button>(R.id.button1)
    private val button2: Button = findViewById<Button>(R.id.button2)
    private val button3: Button = findViewById<Button>(R.id.button3)
    private val button4: Button = findViewById<Button>(R.id.button4)
    private val button5: Button = findViewById<Button>(R.id.button5)
    private val button6: Button = findViewById<Button>(R.id.button6)
    private val buttonzero: Button = findViewById<Button>(R.id.buttonzero)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            player1 += 3
            textviewzero1.text = "$player1"

        }
        button3.setOnClickListener {
            player1 += 2
            textviewzero1.text = "$player1"

        }
        button5.setOnClickListener {
            player1 += 1
            textviewzero1.text = "$player1"

        }
        button2.setOnClickListener {
            player1 += 3
            textviewzero2.text = "$player2"

        }
        button4.setOnClickListener {
            player1 += 2
            textviewzero2.text = "$player2"

        }
        button6.setOnClickListener {
            player1 += 1
            textviewzero2.text = "$player2"

        }
        buttonzero.setOnClickListener {
            player1 = 0
            player2 = 0
            textviewzero1.text = "$player1"
            textviewzero2.text = "$player2"

        }
    }

    override fun onClick(p0: View?) {
        Toast.makeText(this, "View is clicked", Toast.LENGTH_SHORT).show()
        Log.d("ClickEvent","A view iis clicked")
    }


}
