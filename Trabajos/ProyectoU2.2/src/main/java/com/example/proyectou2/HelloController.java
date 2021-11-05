package com.example.proyectou2;

import Datos.Encriptar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContraseña;

    public void iniciarSesion(ActionEvent event) throws IOException {
        String us=txtUsuario.getText();
        String ps=txtContraseña.getText();
        Encriptar encriptar=new Encriptar();
        String bd=encriptar.encriptar("aabb".toCharArray(),0);
        System.out.println(bd);
        String pu=encriptar.encriptar(ps.toCharArray(),0);
        System.out.println(pu);

        if (bd.equals(pu) && us.equals("admin")){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("Pedidos.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900, 500);
            HelloApplication.stage.setTitle("Panaderia");
            HelloApplication.usuario=us;
            HelloApplication.stage.setScene(scene);
        } else {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Datos Incorrectos");
            alert.show();
        }


    }//Llave iniciar sesion

}