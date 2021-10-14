package com.unab.kevin.poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        claseHerencia()

    }

    private fun claseHerencia()
    {

        val cocinero = Cocinero ("Kevin",20, "salvadorena")
        cocinero.trabajar()
        cocinero.VoyATrabajar()
        cocinero.estiloDeCocina()


        val carpintero = Carpintero("Miguel",25)
        carpintero.trabajar()



    }



}

