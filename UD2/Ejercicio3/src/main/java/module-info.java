module org.iesch.di.ejercicio3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesch.di.ejercicio3 to javafx.fxml;
    exports org.iesch.di.ejercicio3;
}