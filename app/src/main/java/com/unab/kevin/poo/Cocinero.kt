package com.unab.kevin.poo

//Aqui se hace lo sigiente para heredar los atributos de la clase Persona

//Al tipo de cocina se le agrega un val antes ya que este es propio del hijo y no viene heredado del padre
class Cocinero(nombre:String,edad:Int, val tipoDeCocina:String):Persona(nombre, edad )
{

override fun trabajar()
{

    println("Esta persona esta asando pollo ")

}

    fun estiloDeCocina()
    {

        println("El estilo del cocinero es:$tipoDeCocina" )


    }

    override fun VoyATrabajar()
    {
        println("Va a un comedor a trabajar")
    }


}