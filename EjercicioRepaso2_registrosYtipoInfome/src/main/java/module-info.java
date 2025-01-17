module org.iesch.di.ejerciciorepaso2_registrosytipoinfome {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesch.di.ejerciciorepaso2_registrosytipoinfome to javafx.fxml;
    exports org.iesch.di.ejerciciorepaso2_registrosytipoinfome;
}