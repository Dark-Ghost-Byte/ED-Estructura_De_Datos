module paquete.holamundofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens paquete.holamundofx to javafx.fxml;
    exports paquete.holamundofx;
}