package org.iesch.di.ejercicio07;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button botonEnviarMensaje;

    @FXML
    private CheckBox checkBoxAceptar;

    @FXML
    private void abrirVentanaDni() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ventana_dni.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage2 = new Stage();
            stage2.setTitle("Ventana info personal");
            stage2.setScene(scene);
            stage2.show();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @FXML
    private void abrirVentanaAvisoLegal() {
        if (!checkBoxAceptar.isSelected()) {
            System.out.println("bobo");
        } else {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("nueva_ventana.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage2 = new Stage();
                stage2.setTitle("Ventana info personal");
                stage2.setScene(scene);
                stage2.show();
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }

    }
}