module com.example.proyectotda {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.proyectotda to javafx.fxml;
    exports com.example.proyectotda;
}