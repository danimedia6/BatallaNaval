module com.example.batalla {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.batalla to javafx.fxml;
    exports com.example.batalla;
}