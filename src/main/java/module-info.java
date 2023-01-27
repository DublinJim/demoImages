module com.example.demoimages {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoimages to javafx.fxml;
    exports com.example.demoimages;
}