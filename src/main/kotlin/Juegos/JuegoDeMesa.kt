package Juegos

class JuegoDeMesa(
    override var id: String,
    override var tipo: String,
    override var nombre: String,
    override var genero: String,
    override var informacion: String,
    override var vecesAlquilado: Int,
    override var edadMinima: Int,
    var jugadoresMax: Int
) :Juego() {

    override fun toString(): String {
        return "JuegoDeMesa(id='$id', tipo='$tipo', nombre='$nombre', genero='$genero', informacion='$informacion', vecesAlquilado=$vecesAlquilado, edadMinima=$edadMinima, jugadoresMax=$jugadoresMax)"
    }
}