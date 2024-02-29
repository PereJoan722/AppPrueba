package com.example.preparacionexamen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Galeria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria)


        supportFragmentManager.beginTransaction()
            .add(R.id.MenuBlanco, Menu())
            .commit()

    }
}