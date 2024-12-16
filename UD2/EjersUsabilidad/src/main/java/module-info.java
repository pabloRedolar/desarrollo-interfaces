module org.iesch.di.ejersusabilidad {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesch.di.ejersusabilidad to javafx.fxml;
    exports org.iesch.di.ejersusabilidad;
}