module org.iesch.di.ejerciciocalculoimc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.iesch.di.ejerciciocalculoimc to javafx.fxml;
    exports org.iesch.di.ejerciciocalculoimc;
}