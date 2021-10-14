package com.example.recursivo;

import Algoritmos.Buscar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class HelloController {
    @FXML TextField txtBuscar;
    @FXML Label lblResultado;

    public void buscar(ActionEvent event){
        try {
            Buscar buscar=new Buscar();
            String ca=txtBuscar.getText().toLowerCase(Locale.ROOT);
            char c=ca.charAt(0);
            //char[] arreglo={'a','b','c'};
            char[] arreglo="abcdefghijklmnñopqrstuvwxyz".toCharArray();
            int pos= buscar.busquedad(c,arreglo,0);
            if (pos == -1){
                lblResultado.setText("Caracter no encontrado");
            } else {
                lblResultado.setText("Encontrado en la pos: "+(pos+1));
            }
        }catch (Exception e){
            lblResultado.setText("ERROR");
        }



    }//Llave button click

}