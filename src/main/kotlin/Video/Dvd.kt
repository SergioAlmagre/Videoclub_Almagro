package Video

class Dvd(
    override var id: String,
    override var tipo: String,
    override var nombre: String,
    override var genero: String,
    override var informacion: String,
    override var vecesAlquilado: Int,
    override var director: String,
    var arañazos:Int
) :Video() {

    override fun toString(): String {
        return "Dvd(id='$id', tipo='$tipo', nombre='$nombre', genero='$genero', informacion='$informacion', vecesAlquilado=$vecesAlquilado, director='$director', arañazos=$arañazos)"
    }

}