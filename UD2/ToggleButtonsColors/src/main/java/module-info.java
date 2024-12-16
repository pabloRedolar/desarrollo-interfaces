module org.iesch.di.togglebuttonscolors {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesch.di.togglebuttonscolors to javafx.fxml;
    exports org.iesch.di.togglebuttonscolors;
}