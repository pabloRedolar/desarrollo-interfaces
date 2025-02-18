package org.example.ejerciciorepaso9;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

import java.sql.*;
import java.util.HashMap;

public class HelloController {
    @FXML
    private Connection con;

    @FXML
    private ComboBox comboBox;

    @FXML
    private Button button;

    private HashMap<String, Object> param;

    @FXML
    public void initialize() {
        String url = "jdbc:mysql://localhost:3306/ventas";
        String user = "root";
        String clave = "1234";
        try {
            con = DriverManager.getConnection(url, user, clave);
            Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select Categoría from ventas.ventas group by Categoría";
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                comboBox.getItems().add(rs.getString("Categoría"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    public void mcCombo() {
        param = new HashMap<>();
        param.put("category", comboBox.getValue());
        System.out.println(param);
    }

    @FXML
    public void mostrarInforme() throws JRException {
        String fileRepo = "informes/Ejercicio repaso 9.jasper";
        JasperPrint jpRepo = JasperFillManager.fillReport(fileRepo, param, con);
        JasperViewer viewer = new JasperViewer(jpRepo, false);
        viewer.setTitle("TITULO INFORME");
        viewer.setVisible(true);
    }
}
