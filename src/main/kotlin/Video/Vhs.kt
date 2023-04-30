package Video

class Vhs(
    override var id: String,
    override var tipo: String,
    override var nombre: String,
    override var genero: String,
    override var informacion: String,
    override var vecesAlquilado: Int,
    override var director: String,
    var veces_rebobinada: Int
) : Video() {

    override fun toString(): String {
        return "Vhs(id='$id', tipo='$tipo', nombre='$nombre', genero='$genero', informacion='$informacion', vecesAlquilado=$vecesAlquilado, director='$director', veces_rebobinada=$veces_rebobinada)"
    }
}