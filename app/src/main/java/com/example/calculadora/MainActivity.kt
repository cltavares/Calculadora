package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        var botao = findViewById<Button>(R.id.button2);

        var text1 = findViewById<EditText>(R.id.editText8);

        var text2 = findViewById<EditText>(R.id.editText10);

        var textofinal = findViewById<EditText>(R.id.editText12);


        button3.setOnClickListener{textofinal.setText((text1.text.toString().toDouble() - text2.text.toString().toDouble()).toString())};
        button5.setOnClickListener{textofinal.setText((text1.text.toString().toDouble() * text2.text.toString().toDouble()).toString())};
        button4.setOnClickListener{textofinal.setText((text1.text.toString().toDouble() / text2.text.toString().toDouble()).toString())};
        button2.setOnClickListener{textofinal.setText((text1.text.toString().toDouble() + text2.text.toString().toDouble()).toString())};

    }
}
