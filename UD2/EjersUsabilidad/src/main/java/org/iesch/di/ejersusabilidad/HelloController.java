package org.iesch.di.ejersusabilidad;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private ComboBox comboBox;

    @FXML
    private RadioButton radioButton;

    @FXML
    private CheckBox checkBox;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ToggleButton toggleButton;

    @FXML
    private ProgressIndicator progressIndicator;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private void initialize() {
        comboBox.getItems().addAll("estilos1", "estios2", "estilos3");

    }

//    @FXML
//    private void

    @FXML
    private void cambiarEstilos() {
        if (comboBox.getValue().equals("estilos1")) {
//            anchorPane.getStylesheets().clear();
            anchorPane.getStylesheets().add(getClass().getResource("estilos1.css").toExternalForm());
        } else if (comboBox.getValue() == "estilos2") {
//            anchorPane.getStylesheets().clear();
            anchorPane.getStylesheets().add(getClass().getResource("estilos2.css").toExternalForm());
        } else {
//            anchorPane.getStylesheets().clear();
            anchorPane.getStylesheets().add(getClass().getResource("estilos3.css").toExternalForm());

        }
    }
}