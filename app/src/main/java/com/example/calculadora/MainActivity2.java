package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    AppCompatButton botao2,botao3,botao4,botao5,botao6;
    AppCompatEditText editText8,editText12,editText10;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao2 =(AppCompatButton)findViewById(R.id.button2);
        botao3 =(AppCompatButton)findViewById(R.id.button3);
        botao4 =(AppCompatButton)findViewById(R.id.button4);
        botao5 =(AppCompatButton)findViewById(R.id.button5);
        botao6 =(AppCompatButton)findViewById(R.id.button6);
        editText8 = (AppCompatEditText) findViewById(R.id.editText8);
        editText12 = (AppCompatEditText) findViewById(R.id.editText12);
        editText10 = (AppCompatEditText) findViewById(R.id.editText10);

        botao2.setOnClickListener(this);
        botao3.setOnClickListener(this);
        botao4.setOnClickListener(this);
        botao5.setOnClickListener(this);
        botao6.setOnClickListener(this);
        

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            
            case R.id.button2:
                somar();
             break;

            case R.id.button3:
                subtrair();
                break;

            case R.id.button4:
                dividir();
                break;

            case R.id.button5:
                multiplicar();
                break;

            case R.id.button6:
                limpar();
                break;   
                
            
        }
        
    }

    private void limpar() {
        editText8.setText("");
        editText12.setText("");
        editText10.setText("");
    }

    private void multiplicar() {
        if(validaText()) {
            Double valor = Double.parseDouble(editText8.getText().toString()) * Double.parseDouble(editText12.getText().toString());
            editText10.setText(valor.toString());
        }

    }

    private void dividir() {
        if(validaText()) {
            Double valor = Double.parseDouble(editText8.getText().toString()) / Double.parseDouble(editText12.getText().toString());
            editText10.setText(valor.toString());
        }

    }

    private void subtrair() {
        if(validaText()) {
            Double valor = Double.parseDouble(editText8.getText().toString()) - Double.parseDouble(editText12.getText().toString());
            editText10.setText(valor.toString());
        }

    }

    private void somar() {
        if(validaText()) {
            Double valor = Double.parseDouble(editText8.getText().toString()) + Double.parseDouble(editText12.getText().toString());
            editText10.setText(valor.toString());
        }
    }

    private Boolean validaText() {

        if(editText8.getText() == null ||  editText8.getText().toString().equals("")) {
            editText8.requestFocus();
            editText8.setError("Preencha o campo valor 1.");

            return false;
        }

        if(editText12.getText() == null ||  editText12.getText().toString().equals("")) {
            editText12.requestFocus();
            editText12.setError("Preencha o campo valor 2.");

            return false;

        }

        return true;

    }
}
