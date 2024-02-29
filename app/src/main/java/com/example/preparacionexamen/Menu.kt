package com.example.preparacionexamen

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Menu.newInstance] factory method to
 * create an instance of this fragment.
 */
class Menu : Fragment() {

    private lateinit var toCalc: ImageButton
    private lateinit var toInicio: ImageButton
    private lateinit var toGaleria: ImageButton
    private lateinit var toTemas: ImageButton


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)


        toCalc = view.findViewById(R.id.btnimgCalculadora)
        toCalc.setOnClickListener(){
            Funciones.toCalculadora(requireContext())
        }

        toInicio = view.findViewById(R.id.imgbtnInicio)
        toInicio.setOnClickListener(){
            Funciones.toInicio(requireContext())
        }

        toGaleria = view.findViewById(R.id.imgbtnGaleria)
        toGaleria.setOnClickListener(){
            Funciones.toGaleria(requireContext())
        }

        toTemas = view.findViewById(R.id.imgbtnTemas)
        toTemas.setOnClickListener(){
            Funciones.toTemas(requireContext())
        }



        return view
    }
}