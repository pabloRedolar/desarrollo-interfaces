module org.iesch.di.ejercicio6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesch.di.ejercicio6 to javafx.fxml;
    exports org.iesch.di.ejercicio6;
}