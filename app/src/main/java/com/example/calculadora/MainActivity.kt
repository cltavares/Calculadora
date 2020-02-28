package com.example.calculadora

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao2 = findViewById<AppCompatButton>(R.id.button2);
        val botao4 = findViewById<AppCompatButton>(R.id.button4);
        val botao3 = findViewById<AppCompatButton>(R.id.button3);
        val botao5 = findViewById<AppCompatButton>(R.id.button5);
        val botao6 = findViewById<AppCompatButton>(R.id.button6);

        val text1 = findViewById<AppCompatEditText>(R.id.editText8);

        val text2 = findViewById<AppCompatEditText>(R.id.editText12);

        val textofinal = findViewById<AppCompatEditText>(R.id.editText10);

        botao2.setOnClickListener {
            // make a toast on button click event
            val text1: Double = text1.getText().toString().toDouble()
            val text2: Double = text2.getText().toString().toDouble()

            var valAdd: Double = text1 + text2;
            textofinal.setText( valAdd.toString());
        }


        botao3.setOnClickListener {
            // make a toast on button click event
            val text1: Double = text1.getText().toString().toDouble()
            val text2: Double = text2.getText().toString().toDouble()

            var valSubtract: Double = text1 - text2;
            textofinal.setText( valSubtract.toString());
        }

        botao4.setOnClickListener {
            // make a toast on button click event
            val text1: Double = text1.getText().toString().toDouble()
            val text2: Double = text2.getText().toString().toDouble()

            var valDivide: Double = text1 / text2;
            textofinal.setText( valDivide.toString());
        }

        botao5.setOnClickListener {

            val text1: Double = text1.getText().toString().toDouble()
            val text2: Double = text2.getText().toString().toDouble()

            var valMultiply: Double = text1 * text2;

            Toast.makeText(this, "Hi multiply."+valMultiply, Toast.LENGTH_LONG).show()
            textofinal.setText( valMultiply.toString());
        }

        botao6.setOnClickListener {
            // make a toast on button click event

            text1.setText("");
            text2.setText("");
            textofinal.setText("");
        }

/*
        botao3.setOnClickListener{textofinal.setText((text1.text.toString().toDouble() - text2.text.toString().toDouble()).toString())};
        botao5.setOnClickListener{textofinal.setText((text1.text.toString().toDouble() * text2.text.toString().toDouble()).toString())};
        botao4.setOnClickListener{textofinal.setText((text1.text.toString().toDouble() / text2.text.toString().toDouble()).toString())};
        botao2.setOnClickListener{textofinal.setText((text1.text.toString().toDouble() + text2.text.toString().toDouble()).toString())};
*/


    }
}
