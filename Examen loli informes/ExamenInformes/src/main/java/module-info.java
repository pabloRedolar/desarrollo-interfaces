module org.iesch.di.exameninformes {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires net.sf.jasperreports.core;


    opens org.iesch.di.exameninformes to javafx.fxml;
    exports org.iesch.di.exameninformes;
}