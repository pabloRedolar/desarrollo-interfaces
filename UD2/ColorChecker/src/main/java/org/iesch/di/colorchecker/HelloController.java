package org.iesch.di.colorchecker;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    ColorPicker colorPicker1 = new ColorPicker();

    @FXML
    ColorPicker colorPicker2 = new ColorPicker();

}