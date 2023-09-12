module com.infosec.projectui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.infosec.projectui to javafx.fxml;
    exports com.infosec.projectui;
}