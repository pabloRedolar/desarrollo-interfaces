package org.iesch.di.hellocontroller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField textFieldNombre;

    @FXML
    private TextField textFieldResultadoNombre;

    @FXML
    protected void onBtnClick(){
        textFieldResultadoNombre.setText("Hola " + textFieldNombre.getText());
    }
}