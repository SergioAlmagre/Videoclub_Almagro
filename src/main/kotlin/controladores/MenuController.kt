package controladores

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.ListView
import javafx.scene.control.MenuButton
import javafx.scene.control.TextArea
import javafx.scene.control.TextField
import javafx.scene.control.ToggleGroup
import javafx.scene.input.MouseEvent

class MenuController {

    @FXML
    private lateinit var barraBusquedaField: TextField

    @FXML
    private lateinit var historialListView: ListView<Any>

    @FXML
    private lateinit var imagen: TextArea

    @FXML
    private lateinit var listaGeneral: ListView<Any>

    @FXML
    private lateinit var monederoField: TextField

    @FXML
    private lateinit var tipos: ToggleGroup

    @FXML
    private lateinit var usuarioMenu: MenuButton

    @FXML
    private lateinit var welcomeText: Label

    @FXML
    fun buscarButton(event: ActionEvent) {

    }

    @FXML
    fun juegosRadio(event: ActionEvent) {

    }

    @FXML
    fun listaGeneralClick(event: MouseEvent) {

    }

    @FXML
    fun musicaRadio(event: ActionEvent) {

    }

    @FXML
    fun peliculasRadio(event: ActionEvent) {

    }

    @FXML
    fun seleccionClickListaHistorial(event: MouseEvent) {

    }

    @FXML
    fun todoRadio(event: ActionEvent) {

    }

    @FXML
    fun usuarioMenu(event: ActionEvent) {

    }

    @FXML
    fun verDetallesButton(event: ActionEvent) {

    }

}
