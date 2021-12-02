package com.example.ordenamiento;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    Metodos metodo = new Metodos();

    @FXML
    protected void onHelloButtonClick() {
        int[] array = {10,1,6,4};
        array = metodo.burbuja(array);
        String x ="";
        for (int j=0;j<array.length;j++){
            x+=+array[j]+", ";
        }
        welcomeText.setText(x);
    }
}