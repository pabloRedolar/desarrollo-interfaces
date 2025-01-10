package org.iesch.di.ud4conectordb;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.*;

public class HelloController {

    ResultSet rs;

    @FXML
    private TextField textFieldNombre;
    @FXML
    private TextField textFieldApellidos;
    @FXML
    private TextField textFieldLocalidad;
    @FXML
    private Button botonAtrasTodos;
    @FXML
    private Button botonAtrasUno;
    @FXML
    private Button botonDelanteUno;
    @FXML
    private Button botonDelanteTodos;

    @FXML
    void initialize() {
        try {
            String url = "jdbc:mysql://localhost:3306/Datos";
            String user = "root";
            String clave = "";

            Connection con = DriverManager.getConnection(url, user, clave);
            Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from datos.empleados";

            rs = stat.executeQuery(sql);

            cargarDatos();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private void cargarDatos() {
        try {
            if (rs.next()) {
                textFieldNombre.setText(rs.getString("Nombre"));
                textFieldApellidos.setText(rs.getString("Apellidos"));
                textFieldLocalidad.setText(rs.getString("Localidad"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void atrasTodos() {
        try {
            rs.first();
            textFieldNombre.setText(rs.getString("Nombre"));
            textFieldApellidos.setText(rs.getString("Apellidos"));
            textFieldLocalidad.setText(rs.getString("Localidad"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void atrasUno() {
        try {

            rs.previous();
            textFieldNombre.setText(rs.getString("Nombre"));
            textFieldApellidos.setText(rs.getString("Apellidos"));
            textFieldLocalidad.setText(rs.getString("Localidad"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void delanteUno() {
        try {
            rs.next();
            textFieldNombre.setText(rs.getString("Nombre"));
            textFieldApellidos.setText(rs.getString("Apellidos"));
            textFieldLocalidad.setText(rs.getString("Localidad"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private void delanteTodos() {
        try {
            rs.last();
            textFieldNombre.setText(rs.getString("Nombre"));
            textFieldApellidos.setText(rs.getString("Apellidos"));
            textFieldLocalidad.setText(rs.getString("Localidad"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}