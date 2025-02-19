module org.example.ejerciciorepaso9 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires net.sf.jasperreports.core;


    opens org.example.ejerciciorepaso9 to javafx.fxml;
    exports org.example.ejerciciorepaso9;
}