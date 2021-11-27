module com.example.gato {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gato to javafx.fxml;
    exports com.example.gato;
}