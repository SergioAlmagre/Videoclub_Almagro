package controladores

import BBDD.Conexion
import Factorias.Factoria
import Musica.Cd
import Musica.Vinilo
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import kotlin.random.Random

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("login_view.fxml"))
        val scene = Scene(fxmlLoader.load())
        stage.title = "Bienvenido al único videoclub del siglo XXI!"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
//    Application.launch(HelloApplication::class.java)

//    menterUsuariosCascoporro()

//    Conexion.registrarUsuario(Factoria.factoriaUsuario())

    Conexion.abrirConexion()
    Conexion.cerrarConexion()

}


fun menterUsuariosCascoporro(){
    try {
        for (i in 0..10){
            Conexion.registrarUsuario(Factoria.factoriaUsuario())
        }
    }catch (ex:Exception){
        println(ex)
    }

}