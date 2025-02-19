package org.iesch.di.ejerciciosrepaso01;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class HelloController {

    ResultSet rs;
    Connection con;

    @FXML
    Button button;

    @FXML
    void initialize() {
        try {
            String url = "jdbc:mysql://localhost:3306/Datos";
            String user = "root";
            String clave = "1234";

            con = DriverManager.getConnection(url, user, clave);
            Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from datos.empleados";

            rs = stat.executeQuery(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private void cargarReporte() {
        try {
            Map<String, Object> parametro = new HashMap<>();

            parametro.put("","");

            JasperReport reporte = JasperCompileManager.compileReport("Informes/reporteBasico.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametro, con);
            JasperViewer view = new JasperViewer(jasperPrint,false);
            view.setVisible(true);
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }
}