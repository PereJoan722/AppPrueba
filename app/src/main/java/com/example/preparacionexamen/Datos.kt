package com.example.preparacionexamen

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class Datos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)

        //Textos e imagenes
        val txtNegro = findViewById<TextView>(R.id.TextoInvisible)
        val txtBlanco = findViewById<TextView>(R.id.txtVisible)
        val imgJohnny = findViewById<ImageView>(R.id.imgJohnny)

        //Botones
        val btnTextoVisible= findViewById<Button>(R.id.btnvisible)
        val btnTextoInvisible= findViewById<Button>(R.id.btnInvisible)
        val btnToInicio= findViewById<ImageButton>(R.id.btntoInicio)




        //Funcionalidad
        btnTextoVisible.setOnClickListener {
            txtNegro.setTextColor(Color.WHITE)
            txtBlanco.setTextColor(Color.BLACK)
            imgJohnny.visibility = View.VISIBLE
        }

        btnTextoInvisible.setOnClickListener {
            txtNegro.setTextColor(Color.BLACK)
            txtBlanco.setTextColor(Color.WHITE)
            imgJohnny.visibility = View.INVISIBLE

        }

        //Para volver a Inicio usando functions
        btnToInicio.setOnClickListener{
            Funciones.toInicio(this)
        }


    }
}