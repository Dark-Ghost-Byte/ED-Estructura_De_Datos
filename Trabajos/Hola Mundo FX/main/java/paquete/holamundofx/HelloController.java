package paquete.holamundofx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class HelloController {
    @FXML private Label welcomeText;

    @FXML private Label txtId;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void eventoClip() {
        Alert alert= new Alert(Alert.AlertType.WARNING);
        alert.setTitle("HOLI");
        alert.setContentText("Hola mundo");
        alert.show();
    }
}