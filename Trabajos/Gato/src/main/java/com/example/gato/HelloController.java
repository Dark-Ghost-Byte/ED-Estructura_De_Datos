package com.example.gato;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,r1;

    @FXML
    Label turno;

    //X = Usuario 1
    //O = usuario 2 o CPU

    boolean turno1=true;

    public void re1(ActionEvent evt){
        b1.setText(""); b2.setText(""); b3.setText("");
        b4.setText(""); b5.setText(""); b6.setText("");
        b7.setText(""); b8.setText(""); b9.setText("");
        b1.setDisable(false); b2.setDisable(false); b3.setDisable(false);
        b4.setDisable(false); b5.setDisable(false); b6.setDisable(false);
        b7.setDisable(false); b8.setDisable(false); b9.setDisable(false);
        turno.setText("Jugador "+( turno1 ? "1" : "2" ));

    }

    public void bt1(ActionEvent evt){
        if (turno1){
            b1.setText("X");
        }else {
            b1.setText("O");
        }
        turno.setText("Jugador "+( turno1 ? "2" : "1" ));
        turno1=!turno1;
        b1.setDisable(true);
        chacarGanador();
    }

    public void bt2(ActionEvent evt){
        if (turno1){
            b2.setText("X");
        }else {
            b2.setText("O");
        }
        turno.setText("Jugador "+( turno1 ? "2" : "1" ));
        turno1=!turno1;
        b2.setDisable(true);
        chacarGanador();
    }

    public void bt3(ActionEvent evt){
        if (turno1){
            b3.setText("X");
        }else {
            b3.setText("O");
        }
        turno.setText("Jugador "+( turno1 ? "2" : "1" ));
        turno1=!turno1;
        b3.setDisable(true);
        chacarGanador();
    }

    public void bt4(ActionEvent evt){
        if (turno1){
            b4.setText("X");
        }else {
            b4.setText("O");
        }
        turno.setText("Jugador "+( turno1 ? "2" : "1" ));
        turno1=!turno1;
        b4.setDisable(true);
        chacarGanador();
    }

    public void bt5(ActionEvent evt){
        if (turno1){
            b5.setText("X");
        }else {
            b5.setText("O");
        }
        turno.setText("Jugador "+( turno1 ? "2" : "1" ));
        turno1=!turno1;
        b5.setDisable(true);
        chacarGanador();
    }

    public void bt6(ActionEvent evt){
        if (turno1){
            b6.setText("X");
        }else {
            b6.setText("O");
        }
        turno.setText("Jugador "+( turno1 ? "2" : "1" ));
        turno1=!turno1;
        b6.setDisable(true);
        chacarGanador();
    }

    public void bt7(ActionEvent evt){
        if (turno1){
            b7.setText("X");
        }else {
            b7.setText("O");
        }
        turno.setText("Jugador "+( turno1 ? "2" : "1" ));
        turno1=!turno1;
        b7.setDisable(true);
        chacarGanador();
    }

    public void bt8(ActionEvent evt){
        if (turno1){
            b8.setText("X");
        }else {
            b8.setText("O");
        }
        turno.setText("Jugador "+( turno1 ? "2" : "1" ));
        turno1=!turno1;
        b8.setDisable(true);
        chacarGanador();
    }

    public void bt9(ActionEvent evt){
        if (turno1){
            b9.setText("X");
        }else {
            b9.setText("O");
        }
        turno.setText("Jugador "+( turno1 ? "2" : "1" ));
        turno1=!turno1;
        b9.setDisable(true);
        chacarGanador();
    }

    public void chacarGanador(){
        //LINEA DE ARRIBA
        if (b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")){
            turno.setText("Gano Jugador 1");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        } else if (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O")){
            turno.setText("Gano Jugador 2");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        }

        //LINEA DE ENMEDIO
        if (b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")){
            turno.setText("Gano Jugador 1");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        } else if (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O")){
            turno.setText("Gano Jugador 2");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        }

        //LINEA DE ABAJO
        if (b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")){
            turno.setText("Gano Jugador 1");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        } else if (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O")){
            turno.setText("Gano Jugador 2");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        }

        //LINEA DE LA IZQUIERDA
        if (b1.getText().equals("X") && b4.getText().equals("X") && b7.getText().equals("X")){
            turno.setText("Gano Jugador 1");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        } else if (b1.getText().equals("O") && b4.getText().equals("O") && b7.getText().equals("O")){
            turno.setText("Gano Jugador 2");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        }

        //LINEA DEL CENTRO
        if (b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")){
            turno.setText("Gano Jugador 1");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        } else if (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O")){
            turno.setText("Gano Jugador 2");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        }

        //LINEA DE LA DERECHA
        if (b3.getText().equals("X") && b6.getText().equals("X") && b9.getText().equals("X")){
            turno.setText("Gano Jugador 1");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        } else if (b3.getText().equals("O") && b6.getText().equals("O") && b9.getText().equals("O")){
            turno.setText("Gano Jugador 2");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        }

        //LINEA DE LA DIAGONAL 1
        if (b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")){
            turno.setText("Gano Jugador 1");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        } else if (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O")){
            turno.setText("Gano Jugador 2");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        }

        //LINEA DE LA DIAGONAL 2
        if (b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")){
            turno.setText("Gano Jugador 1");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        } else if (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O")){
            turno.setText("Gano Jugador 2");
            b1.setDisable(true); b2.setDisable(true); b3.setDisable(true);
            b4.setDisable(true); b5.setDisable(true); b6.setDisable(true);
            b7.setDisable(true); b8.setDisable(true); b9.setDisable(true);
        }
    }
}