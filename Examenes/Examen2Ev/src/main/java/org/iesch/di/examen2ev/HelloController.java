package org.iesch.di.examen2ev;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.Objects;

public class HelloController {
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ComboBox comboBox;

    @FXML
    private ToggleButton buttonF;

    @FXML
    private ToggleButton buttonAM;

    @FXML
    private ToggleButton buttonAV;

    @FXML
    private ToggleButton buttonN;

    @FXML
    private ImageView imageView;

    @FXML
    private Slider slider;

    @FXML
    private TextField textFieldIndependencia;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private ProgressIndicator progressIndicator;

    @FXML
    private RadioButton rbF;

    @FXML
    private RadioButton rbAm;

    @FXML
    private RadioButton rbAv;

    @FXML
    private RadioButton rbN;

    @FXML
    private void initialize() {
        comboBox.getItems().addAll("estilos1", "estilos2", "estilos3");
    }

    @FXML
    private void abrirAyuda() {
        Image image = new Image(getClass().getResource("ayuda.png").toExternalForm());
        ImageView imageView = new ImageView(image);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ayuda");
        alert.setContentText("F: Frecuentemente, AM: A menudo, AV: A veces, N: Nunca");
        alert.setGraphic(imageView);
        alert.setHeaderText(null);
        alert.show();
    }

    @FXML
    private void setTextFieldIndependencia() {
        double valor = slider.getValue();

        if (valor >= 0 && valor < 25) {
            textFieldIndependencia.setText("Nada indepentiende");
        } else if (valor >= 25 && valor < 50) {
            textFieldIndependencia.setText("Poco independiente");
        } else if (valor >= 50 && valor < 75) {
            textFieldIndependencia.setText("Bastante indepentiende");
        } else if (valor >= 75 && valor <= 100) {
            textFieldIndependencia.setText("Muy indepentiende");
        }
    }

    @FXML
    private void aumentarProgressIndicator() {
        double aumento = 0;
        if (rbF.isSelected()) {
            aumento = 1;
        } else if (rbAm.isSelected()) {
            aumento = 0.75;
        } else if (rbAv.isSelected()) {
            aumento = 0.50;
        } else if (rbN.isSelected()) {
            aumento = 0.25;
        }

        progressIndicator.setProgress(aumento);
    }

    @FXML
    private void aumentarProgreso() {
        double aumento = 0;
        if (buttonF.isSelected()) {
            aumento = 1;
        } else if (buttonAM.isSelected()) {
            aumento = 0.75;
        } else if (buttonAV.isSelected()) {
            aumento = 0.50;
        } else if (buttonN.isSelected()) {
            aumento = 0.25;
        }

        progressBar.setProgress(aumento);
    }

    @FXML
    private void cambiarEstilos() {
        if (comboBox.getValue().equals("estilos1")) {

            anchorPane.getStylesheets().clear();
            anchorPane.getStylesheets().add(Objects.requireNonNull(getClass().getResource("estilo1.css")).toExternalForm());
        } else if (comboBox.getValue().equals("estilos2")) {

            anchorPane.getStylesheets().clear();
            anchorPane.getStylesheets().add(Objects.requireNonNull(getClass().getResource("estilo2.css")).toExternalForm());
        } else if (comboBox.getValue().equals("estilos3")) {

            anchorPane.getStylesheets().clear();
            anchorPane.getStylesheets().add(Objects.requireNonNull(getClass().getResource("estilo3.css")).toExternalForm());

        }
    }
}
