module org.iesch.di.ejercicio1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesch.di.ejercicio1 to javafx.fxml;
    exports org.iesch.di.ejercicio1;
}