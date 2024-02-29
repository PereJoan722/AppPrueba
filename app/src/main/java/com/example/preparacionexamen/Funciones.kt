package com.example.preparacionexamen

import android.content.Context
import android.content.Intent

object Funciones {

    fun toCalculadora(context: Context){
        val intent = Intent(context, Calculadora::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        context.startActivity(intent)
    }

    fun toInicio(context: Context){
        val intent = Intent(context, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        context.startActivity(intent)
    }

    fun toGaleria(context: Context){
        val intent = Intent(context, Galeria::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        context.startActivity(intent)
    }

    fun toTemas(context: Context){

        val intent = Intent(context, Temas::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        context.startActivity(intent)
    }



}