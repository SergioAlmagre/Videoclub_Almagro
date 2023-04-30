package controladores

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.DatePicker
import javafx.scene.control.ProgressBar
import javafx.scene.control.TextField
import javafx.scene.text.Text

class SingUpView {

    @FXML
    private lateinit var barraProgresoResitro: ProgressBar

    @FXML
    private lateinit var contraseñaField: TextField

    @FXML
    private lateinit var correoElectronicoField: TextField

    @FXML
    private lateinit var cuentaAtras: Text

    @FXML
    private lateinit var fechaNacimiento: DatePicker

    @FXML
    private lateinit var monederoField: TextField

    @FXML
    private lateinit var repetirContraseñaField: TextField

    @FXML
    fun aceptoCondicionesCheck(event: ActionEvent) {

    }

    @FXML
    fun registrarmeButton(event: ActionEvent) {

    }

    @FXML
    fun volverButton(event: ActionEvent) {

    }

}
