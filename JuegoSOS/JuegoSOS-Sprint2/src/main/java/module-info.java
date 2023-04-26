module com.example.juegosos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.juegosos to javafx.fxml;
    exports com.example.juegosos;
}