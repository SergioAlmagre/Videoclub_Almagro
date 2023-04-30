package Sistema

import java.util.*

class Alquiler {

    var precioDia:Double
    var diaRetirada: Date
    var diaEntrega: Date
    var diferenciaRE:Int
    var diasRetraso:Int
    var penalizacion:Boolean
    var cantiPenaliza:Double

    constructor(
        precioDia: Double,
        diaRetirada: Date,
        diaEntrega: Date,
        diferenciaRE: Int,
        diasRetraso: Int,
        penalizacion: Boolean,
        cantiPenaliza: Double,
    ) {
        this.precioDia = precioDia
        this.diaRetirada = diaRetirada
        this.diaEntrega = diaEntrega
        this.diferenciaRE = diferenciaRE
        this.diasRetraso = diasRetraso
        this.penalizacion = penalizacion
        this.cantiPenaliza = cantiPenaliza
    }

    override fun toString(): String {
        return "Alquiler(precioDia=$precioDia, diaRetirada=$diaRetirada, diaEntrega=$diaEntrega, diferenciaRE=$diferenciaRE, diasRetraso=$diasRetraso, penalizacion=$penalizacion, cantiPenaliza=$cantiPenaliza)"
    }


}