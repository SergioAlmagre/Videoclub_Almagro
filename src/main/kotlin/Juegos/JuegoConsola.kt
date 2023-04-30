package Juegos

class JuegoConsola(
    override var id: String,
    override var tipo: String,
    override var nombre: String,
    override var genero: String,
    override var informacion: String,
    override var vecesAlquilado: Int,
    override var edadMinima: Int,
    var plataforma: String
) :Juego() {
    override fun toString(): String {
        return "JuegoConsola(id='$id', tipo='$tipo', nombre='$nombre', genero='$genero', informacion='$informacion', vecesAlquilado=$vecesAlquilado, edadMinima=$edadMinima, plataforma='$plataforma')"
    }
}