package org.iesch.di.ejerciciograficos;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.*;

public class HelloController {

    ResultSet rs;
    Connection con;

    @FXML
    void initialize() {
        try {
            String url = "jdbc:mysql://localhost:3306/Datos";
            String user = "root";
            String clave = "";

            con = DriverManager.getConnection(url, user, clave);
            Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from datos.empleados";

            rs = stat.executeQuery(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}