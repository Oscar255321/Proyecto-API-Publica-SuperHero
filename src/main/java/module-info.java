module com.example.redapi_publica {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires retrofit2.converter.gson;
    requires com.google.gson;


    opens com.example.redapi_publica to javafx.fxml;
    exports com.example.redapi_publica;
    exports com.example.redapi_publica.Clases;
    opens com.example.redapi_publica.Clases to javafx.fxml;
}