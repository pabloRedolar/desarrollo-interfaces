module org.iesch.di.examen2ev {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesch.di.examen2ev to javafx.fxml;
    exports org.iesch.di.examen2ev;
}