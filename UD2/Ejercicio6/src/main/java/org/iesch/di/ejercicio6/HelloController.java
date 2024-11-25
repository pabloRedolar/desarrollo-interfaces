package org.iesch.di.ejercicio6;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Menu menu;

    @FXML
    private MenuItem menuItem;

    @FXML
    private MenuItem menuItem1;

    @FXML
    private MenuItem menuItem3;

    @FXML
    protected void setEstilo1() {
        anchorPane.getStylesheets().add(getClass().getResource("estilo1.css").toExternalForm());
    }

    @FXML
    protected void setEstilo2() {
        anchorPane.getStylesheets().add(getClass().getResource("estilo2.css").toExternalForm());
    }

    @FXML
    protected void reset() {
        anchorPane.getStylesheets().clear();

    }

}