package BBDD

import Sistema.Usuario
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

object Conexion {

    // ********************* Atributos *************************
    var conexion: Connection? = null

    // Atributo a través del cual hacemos la conexión física.
    var sentenciaSQL: Statement? = null

    // Atributo que nos permite ejecutar una sentencia SQL
    var registros: ResultSet? = null


    fun abrirConexion(): Int {
        var cod = 0
        try {
            // Cargar el driver/controlador JDBC de MySql
            val controlador = "com.mysql.cj.jdbc.Driver"
            val URL_BD = "jdbc:mysql://" + Constantes.servidor + ":" + Constantes.puerto + "/" + Constantes.bbdd
            Class.forName(controlador)

            // Realizamos la conexión a una BD con un usuario y una clave.
            conexion = DriverManager.getConnection(URL_BD, Constantes.usuario, Constantes.passwd)
            sentenciaSQL = conexion!!.createStatement()
            println("Conexion realizada con éxito")
        } catch (e: Exception) {
            println("Exception: " + e.message)
            cod = -1
        }
        return cod
    }

    fun cerrarConexion(): Int {
        var cod = 0
        try {
            conexion!!.close()

        } catch (ex: Exception) {
            println("Error al cerrar la conexión.")
            cod = -1
        }
        return cod
    }


    fun registrarUsuario(usu: Usuario){
        try {

            var sentencia = "INSERT INTO ${Constantes.tablaUsuario} VALUES (?,?,?,?,?,?,?)"
            abrirConexion()
            var pstmt = conexion!!.prepareStatement(sentencia)
            pstmt.setString(1, usu.nombre)
            pstmt.setString(2, usu.dni)
            pstmt.setString(3, usu.telefono)
            pstmt.setString(4, usu.contraseña)
            pstmt.setDouble(5, usu.monedero)
            pstmt.setInt(6, usu.premium)
            pstmt.setInt(7, usu.edad)
            println(sentencia)
            pstmt.executeUpdate()
            cerrarConexion()
        }catch (ex:Exception){
            println(ex)
        }
    }




    fun validarUsuario(dni:String, contraseña:String):Boolean{
        var existe:Boolean = false




        return existe
    }


















}



