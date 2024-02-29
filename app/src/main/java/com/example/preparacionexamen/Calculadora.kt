package com.example.preparacionexamen

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Calculadora : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)


        supportFragmentManager.beginTransaction()
            .add(R.id.MenuBlanco, Menu())
            .commit()


        //Texto Calculadora

        //Botones
        val btnSumar= findViewById<Button>(R.id.btnSumar)
        val btnRestar= findViewById<Button>(R.id.btnRestar)
        val btnMultiplicar= findViewById<Button>(R.id.btnMultiplicar)
        val btnDividir= findViewById<Button>(R.id.btnDividir)

        //Números que se muestran en pantalla
        val txtNum1 = findViewById<TextView>(R.id.txtNum1)
        val txtNum2 = findViewById<TextView>(R.id.txtNum2)
        val resultado = findViewById<TextView>(R.id.txtNum)

        btnSumar.setOnClickListener {
            val num1 = txtNum1.text.toString().toFloatOrNull() ?: 0f
            val num2 = txtNum2.text.toString().toFloatOrNull() ?: 0f
            val suma = num1 + num2
            resultado.text = suma.toString()
        }

        btnRestar.setOnClickListener {
            val num1 = txtNum1.text.toString().toFloatOrNull() ?: 0f
            val num2 = txtNum2.text.toString().toFloatOrNull() ?: 0f
            val resta = num1 - num2
            resultado.text = resta.toString()
        }

        btnMultiplicar.setOnClickListener {
            val num1 = txtNum1.text.toString().toFloatOrNull() ?: 0f
            val num2 = txtNum2.text.toString().toFloatOrNull() ?: 0f
            val multiplicar = num1 * num2
            resultado.text = multiplicar.toString()
        }

        btnDividir.setOnClickListener {
            val num1 = txtNum1.text.toString().toFloatOrNull() ?: 0f
            val num2 = txtNum2.text.toString().toFloatOrNull() ?: 0f
            val dividir = num1 / num2
            resultado.text = dividir.toString()
        }



    }


}