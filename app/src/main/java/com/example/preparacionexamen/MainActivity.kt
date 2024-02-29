package com.example.preparacionexamen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //para los botones hay que crear un new Fragment Blank (menú)

        val btnToDatos = findViewById<Button>(R.id.btnDatos)

        val btntoCalculadora= findViewById<Button>(R.id.btnInicio)

        btnToDatos.setOnClickListener {
            val intent = Intent(this@MainActivity, Datos::class.java)
            startActivity(intent)
        }

        btntoCalculadora.setOnClickListener {
            val aa = Intent(this@MainActivity, Calculadora::class.java)
            startActivity(aa)
        }


    }
}