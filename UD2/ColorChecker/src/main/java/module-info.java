module org.iesch.di.colorchecker {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesch.di.colorchecker to javafx.fxml;
    exports org.iesch.di.colorchecker;
}