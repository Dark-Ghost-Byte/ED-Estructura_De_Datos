module com.example.proyectou2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectou2 to javafx.fxml;
    exports com.example.proyectou2;
}