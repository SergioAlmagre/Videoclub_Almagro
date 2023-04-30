package Musica

class Vinilo(
    override var id: String,
    override var tipo: String,
    override var nombre: String,
    override var genero: String,
    override var informacion: String,
    override var vecesAlquilado: Int,
    override var cancionMasReproducida: Int,
    var tamaño:Int
) :Musica() {

    override fun toString(): String {
        return "Vinilo(id='$id', tipo='$tipo', nombre='$nombre', genero='$genero', informacion='$informacion', vecesAlquilado=$vecesAlquilado, cancionMasReproducida=$cancionMasReproducida, tamaño=$tamaño)"
    }

}