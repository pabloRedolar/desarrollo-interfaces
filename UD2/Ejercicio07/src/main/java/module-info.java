module org.iesch.di.ejercicio07 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesch.di.ejercicio07 to javafx.fxml;
    exports org.iesch.di.ejercicio07;
}