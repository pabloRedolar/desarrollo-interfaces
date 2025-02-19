module org.iesch.di.ejerciciosrepaso01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires net.sf.jasperreports.core;


    opens org.iesch.di.ejerciciosrepaso01 to javafx.fxml;
    exports org.iesch.di.ejerciciosrepaso01;
}