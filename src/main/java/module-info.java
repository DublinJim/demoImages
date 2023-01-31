module com.example.demoimages {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;


    opens com.example.demoimages to javafx.fxml;
    exports com.example.demoimages;
}