module org.iesch.di.ud4conectordb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;
    requires net.sf.jasperreports.core;


    opens org.iesch.di.ud4conectordb to javafx.fxml;
    exports org.iesch.di.ud4conectordb;
}