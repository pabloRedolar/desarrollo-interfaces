package org.iesch.di.ejercicio3;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;


public class HelloController {

    @FXML
    private final Button botonEstilo1 = new Button();

    @FXML
    private final Button botonEstilo2 = new Button();

    @FXML
    private final Button botonEstilo3 = new Button();

    @FXML
    private final Button botonResetear = new Button();

    @FXML
    private final Button botonSalir = new Button();


    @FXML
    private void setBotonEstilo1OnClick() {

    }

    @FXML
    private void setBotonEstilo2OnClick() {

    }

    @FXML
    private void setBotonEstilo3OnClick() {

    }

    @FXML
    private void setBotonSalirOnClick() {
        System.exit(0);
    }
}