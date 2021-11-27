module com.example.grafosrutacorta {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.grafosrutacorta to javafx.fxml;
    exports com.example.grafosrutacorta;
}