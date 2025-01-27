module org.iesch.di.ejerciciograficos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.iesch.di.ejerciciograficos to javafx.fxml;
    exports org.iesch.di.ejerciciograficos;
}