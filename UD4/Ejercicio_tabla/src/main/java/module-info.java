module org.iesch.di.ejercicio_tabla {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesch.di.ejercicio_tabla to javafx.fxml;
    exports org.iesch.di.ejercicio_tabla;
}