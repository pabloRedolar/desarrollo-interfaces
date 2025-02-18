module org.iesch.di.ejercicio8ejersrepaso {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesch.di.ejercicio8ejersrepaso to javafx.fxml;
    exports org.iesch.di.ejercicio8ejersrepaso;
}