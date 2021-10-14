package com.unab.kevin.poo

class Carpintero(nombre:String,edad:Int):Persona(nombre,edad)
{
//Aca ponemos override porque el padre ya tiene una funcion llamada trabajar y con esto lo podemos
    //volver a utilizar en un hijo
override fun trabajar()
{
println("Esta persona esta cortando madera")

    //esto de super es como que volvemos a imprimir la funcion de la clase padre en la clase hijo
    super.trabajar()
}

}