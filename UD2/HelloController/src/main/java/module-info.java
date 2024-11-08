module org.iesch.di.hellocontroller {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.iesch.di.hellocontroller to javafx.fxml;
    exports org.iesch.di.hellocontroller;
}