package Factorias

import Sistema.Usuario
import kotlin.random.Random

object Factoria {

    fun factoriaUsuario():Usuario{
        val dni = Random.nextInt(100000000,999999999).toString()
        val nombres = arrayOf("María", "Juan", "Lucía", "Pablo", "Lola", "Javier", "Ana", "Pedro", "Carmen", "Sergio", "Sara", "Ricardo", "Alicia", "Diego", "Laura", "Miguel", "Elena", "Carlos", "Raquel", "Jorge")
        val nombre = nombres[Random.nextInt(0,nombres.size-1)]
        val premium = Random.nextInt(0,2) // 0 = NO , 1 = SI
        val edad = Random.nextInt(22,105)
        var telefono = "+34 - " + Random.nextInt(100,999).toString() + "-" + Random.nextInt(100,999).toString() + "-" + Random.nextInt(100,999).toString()
        var monedero = Random.nextDouble(0.0,50.0)
        var contraseña = "1234"

        val usu = Usuario(nombre,dni,telefono,contraseña,monedero,premium,edad)
        return  usu
    }

}