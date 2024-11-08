package org.iesch.di.hellocontroller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button boton1;

    protected void onBoton2onClick(){

    }

    @FXML
    private Button boton2;

    @FXML
    private Button boton3;
}