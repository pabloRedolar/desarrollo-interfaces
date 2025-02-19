package org.iesch.di.exameninformes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

import java.io.File;
import java.sql.*;
import java.util.HashMap;

public class HelloController {

    Connection con;

    private HashMap<String, Object> paramInfore1;

    private HashMap<String, Object> paramInfore2;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private Button buttonInforme1;

    @FXML
    private Button buttonInforme2;

    @FXML
    private TextField minimo;

    @FXML
    private TextField maximo;

    @FXML
    public void initialize() {
        String url = "jdbc:mysql://localhost:3306/ventas";
        String user = "root";
        String clave = "";
        try {
            con = DriverManager.getConnection(url, user, clave);
            Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            String sql = "select DISTINCT Localidad from ventas.facturas";
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                comboBox.getItems().add(rs.getString("Localidad"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void mostrarInforme1() throws JRException {
        paramInfore1 = new HashMap<>();
        paramInfore1.put("localidad", comboBox.getValue());
        paramInfore1.put("imagen", "file:images/logo.png");

        String fileRepo = "informes/InformeEjer1.jasper";
        JasperPrint jpRepo = JasperFillManager.fillReport(fileRepo, paramInfore1, con);
        JasperViewer viewer = new JasperViewer(jpRepo, false);
        viewer.setTitle("TITULO INFORME 1");
        viewer.setVisible(true);
    }


    public void mostrarInforme2() throws JRException {
        paramInfore2 = new HashMap<>();
        paramInfore2.put("minimo", Integer.parseInt(minimo.getText()));
        paramInfore2.put("maximo", Integer.parseInt(maximo.getText()));
        paramInfore2.put("imagen", "file:images/logo.png");

        String fileRepo = "informes/InformeEjer2.jasper";
        JasperPrint jpRepo = JasperFillManager.fillReport(fileRepo, paramInfore2, con);
        JasperViewer viewer = new JasperViewer(jpRepo, false);
        viewer.setTitle("TITULO INFORME 2");
        viewer.setVisible(true);
    }

}