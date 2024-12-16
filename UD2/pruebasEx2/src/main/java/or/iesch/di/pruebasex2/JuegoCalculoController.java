package or.iesch.di.pruebasex2;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;

import java.io.IOException;
import java.util.Random;

public class JuegoCalculoController {

    @FXML private TextField txtNumeroObjetivo;
    @FXML private TextField txtNumeroUsuario;

    @FXML private Button btn1, btn2, btn5, btn7, btn10, btn15, btn20, btn25, btn50, btn60, btn75, btn100;

    private int numeroObjetivo;
    private int numeroUsuario;

    @FXML
    public void initialize() {
        iniciarNuevoJuego();
    }

    @FXML
    private void iniciarNuevoJuego() {
        Random random = new Random();
        numeroObjetivo = random.nextInt(200) + 1;
        txtNumeroObjetivo.setText(String.valueOf(numeroObjetivo));

        numeroUsuario = 0;
        txtNumeroUsuario.setText("0");

        btn1.setDisable(false);
        btn2.setDisable(false);
        btn5.setDisable(false);
        btn7.setDisable(false);
        btn10.setDisable(false);
        btn15.setDisable(false);
        btn20.setDisable(false);
        btn25.setDisable(false);
        btn50.setDisable(false);
        btn60.setDisable(false);
        btn75.setDisable(false);
        btn100.setDisable(false);
    }

    @FXML
    private void agregarNumero(javafx.event.ActionEvent event) {
        Button boton = (Button) event.getSource();
        int numero = Integer.parseInt(boton.getText());

        numeroUsuario += numero;
        txtNumeroUsuario.setText(String.valueOf(numeroUsuario));

        boton.setDisable(true);

        if (numeroUsuario == numeroObjetivo) {
            mostrarMensaje("¡Felicidades!", "¡Has conseguido el número objetivo!", AlertType.INFORMATION);
            iniciarNuevoJuego();
        } else if (numeroUsuario > numeroObjetivo) {
            mostrarMensaje("¡Lo siento!", "Te has pasado del número objetivo.", AlertType.WARNING);
            iniciarNuevoJuego();
        }
    }

    @FXML
    private void mostrarInstrucciones() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Instrucciones.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Instrucciones");
            stage.setScene(new Scene(root));
            stage.showAndWait();

        } catch (IOException e) {
            mostrarMensaje("Error", "No se pudo cargar la ventana de instrucciones.", AlertType.ERROR);
        }
    }

    private void mostrarMensaje(String titulo, String mensaje, AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
