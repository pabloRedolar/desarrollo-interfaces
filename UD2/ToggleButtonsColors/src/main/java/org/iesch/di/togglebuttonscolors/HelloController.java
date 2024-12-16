package org.iesch.di.togglebuttonscolors;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Paint;

public class HelloController {
    @FXML
    Label labelLorem;

    @FXML
    ToggleButton btnRojo;

    @FXML
    ToggleButton btnVerde;

    @FXML
    ToggleButton btnAzul;

    @FXML
    ToggleButton btnVerdana;

    @FXML
    ToggleButton btnTahoma;

    @FXML
    ToggleButton btnCourrier;

    @FXML
    ToggleButton btn10;

    @FXML
    ToggleButton btn20;

    @FXML
    ToggleButton btn30;

    @FXML
    public void setearColor() {
        if (btnRojo.isSelected()) {
            labelLorem.setBackground(new Background.fill(Paint.valueOf("red")));
        }
    }


}