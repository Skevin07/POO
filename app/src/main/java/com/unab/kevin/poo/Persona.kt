package com.unab.kevin.poo

//Como nosotros queremos que esta clase herede hijos, ponemos antes de la clase la palabra open
open class Persona (nombre:String,edad:Int)
{

   //Aca ponemos un open en la funcion ya que queremos que un hijo utilice dicha funcion
open fun trabajar()
{
   println("Esta persona esta trabajando")
}

   open fun VoyATrabajar()
   {

      println("Se dirije a trabajar")

   }


}