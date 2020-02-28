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

            var valor1: String = text1.getText().toString()
            var valor2: String = text2.getText().toString()

            if (validaText(valor1,valor2)) {

                var valMultiply: Double =
                    valor1.toString().toDouble() * valor2.toString().toDouble();

                Toast.makeText(this, "Hi multiply." + valMultiply, Toast.LENGTH_LONG).show()
                textofinal.setText(valMultiply.toString());
            }
        }

        botao6.setOnClickListener {
            // make a toast on button click event

            text1.setText("");
            text2.setText("");
            textofinal.setText("");
        }


    }

    fun validaText(texto1: String, texto2: String): Boolean {

        if(texto1 == "" && texto2 == "") {
            Toast.makeText(this, "Favor informar o valores.", Toast.LENGTH_LONG).show()
            return false;
        }
        return true;

    }
}
