package org.iesch.di.ejerciciocalculoimc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ListFormat;

public class HelloController {

    @FXML
    TextField peso;

    @FXML
    TextField talla;

    @FXML
    Button calcular;

    @FXML
    Button cancelar;

    @FXML
    Label imcResultado;

    @FXML
    Label resultadoPeso;

    @FXML
    ImageView imageView;


    public void calcularIMC() {
        double imc = Double.parseDouble(peso.getText()) / ((Double.parseDouble(talla.getText()) / 100) * (Double.parseDouble(talla.getText()) / 100));

        imcResultado.setText(String.valueOf(imc));

        if (imc >= 0 && imc <= 25) {
            resultadoPeso.setText("IMC normal");
            resultadoPeso.setBackground(Background.fill(Color.GREEN));
        } else if (imc >= 25 && imc <= 29.9) {
            resultadoPeso.setText("Tiene sobrepeso");
            resultadoPeso.setBackground(Background.fill(Color.YELLOW));
        } else if (imc >= 30) {
            resultadoPeso.setText("Tiene obesidad");
            resultadoPeso.setBackground(Background.fill(Color.RED));
        }

    }

    public void mostrarAyuda() {
        try {
            Desktop.getDesktop().open(new File("carpeta/Documentación app imc.pdf"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void borrarDatos() {
        peso.setText("");
        talla.setText("");
        resultadoPeso.setText("");
        imcResultado.setText("");

    }

}