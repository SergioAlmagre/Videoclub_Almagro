package controladores

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.TextArea
import javafx.scene.control.TextField
import javafx.scene.image.ImageView

class InformacionView {

    @FXML
    private lateinit var imagen: ImageView

    @FXML
    private lateinit var informacionPanel: TextArea

    @FXML
    private lateinit var precioField: TextField

    @FXML
    private lateinit var tipoField: TextField

    @FXML
    private lateinit var tituloField: TextField

    @FXML
    fun alquilarButton(event: ActionEvent) {

    }

    @FXML
    fun volverButton(event: ActionEvent) {

    }

}
