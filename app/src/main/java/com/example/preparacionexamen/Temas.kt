package com.example.preparacionexamen

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Temas : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences("MiPreferencia", Context.MODE_PRIVATE)
        val TemaPantalla = sharedPreferences.getInt("temaPantalla", 1)


        if(TemaPantalla >= 1){
            setTheme(R.style.Theme_PreparacionExamen)
        } else {
            setTheme(R.style.Theme_NuevoTema)
        }

        setContentView(R.layout.activity_temas)

        supportFragmentManager.beginTransaction()
            .add(R.id.Meniu, Menu())
            .commit()

        val btn1 = findViewById<Button>(R.id.btnTema1)
        val btn2 = findViewById<Button>(R.id.btnTema2)


        btn1.setOnClickListener {
            guardarTema(1)
            recreate()
        }

        btn2.setOnClickListener {
            guardarTema(0)
            recreate()
        }
    }

    private fun guardarTema(tema: Int) {
        sharedPreferences.edit().putInt("temaPantalla", tema).apply()
    }
}
