package com.example.proyectotda;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
   @FXML TextField txtNombre;
    @FXML TextField txtCilindros;
    @FXML TextField txtColor;
    @FXML TextField txtMarca;
    @FXML TextField txtPrecio;
    @FXML TextField txtVer;
    @FXML ImageView imgV1;
    @FXML ImageView imgV2;
    @FXML Label lblVer;
    Autos arreglo[];
    int cont=0;

    @FXML protected void initialize(){
        arreglo=new Autos[10];
    }
   @FXML private void eventoInsertar(){
        String n=txtNombre.getText().toString();
       String cilin=txtCilindros.getText().toString();
       String colr=txtColor.getText().toString();
       String mar=txtMarca.getText().toString();
       String prec=txtPrecio.getText().toString();

       if (n.equals("")||cilin.equals("")||colr.equals("")||mar.equals("")||prec.equals("")){
           Alert alert=new Alert(Alert.AlertType.ERROR);
           alert.setContentText("Favor de llenar los campos");
           alert.show();
       }else {
           int Cilnd=Integer.parseInt(cilin);
           int Prec=Integer.parseInt(prec);
           Autos autos =new Autos(n,Cilnd,colr,mar,Prec);
           arreglo[cont]= autos;
           cont++;
           txtCilindros.setText("");
           txtNombre.setText("");
           txtColor.setText("");
           txtMarca.setText("");
           txtPrecio.setText("");
           Alert alert=new Alert(Alert.AlertType.INFORMATION);
           alert.setContentText("Datos agregados correctamente");
           alert.show();
       }

   }
    @FXML private void eventoVer(){
        int x=Integer.parseInt(txtVer.getText());
        Autos ver=arreglo[x-1];
        txtNombre.setText(ver.getNombre());
        txtCilindros.setText(""+ver.getCilindros());
        txtColor.setText(ver.getColor());
        txtMarca.setText(ver.getMarca());
        txtPrecio.setText(""+ver.getPrecio());
        int x2=Integer.parseInt(txtCilindros.getText());
        if (x2==6){
            Image mustang=new Image(getClass().getResourceAsStream("/img/mustang.jpeg"));
            Image v6=new Image(getClass().getResourceAsStream("/img/v6.jpeg"));
            imgV1.setImage(mustang);
            imgV2.setImage(v6);
        }else if(x2==4) {
            Image aveo=new Image(getClass().getResourceAsStream("/img/aveo.jpg"));
            Image v4=new Image(getClass().getResourceAsStream("/img/v4.jpeg"));
            imgV1.setImage(aveo);
            imgV2.setImage(v4);
        }else if (x2==5){
            Image hummer=new Image(getClass().getResourceAsStream("/img/Hummer.jpeg"));
            Image v5=new Image(getClass().getResourceAsStream("/img/v5.jpeg"));
            imgV1.setImage(hummer);
            imgV2.setImage(v5);
        }else if (x2==8){
            Image ram=new Image(getClass().getResourceAsStream("/img/Ram.jpeg"));
            Image v8=new Image(getClass().getResourceAsStream("/img/v8.jpeg"));
            imgV1.setImage(ram);
            imgV2.setImage(v8);
        }else{
            Image notfund1=new Image(getClass().getResourceAsStream("/img/lupa.png"));
            Image notfund2=new Image(getClass().getResourceAsStream("/img/lupa.png"));
            imgV1.setImage(notfund1);
            imgV2.setImage(notfund2);
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("No se encontraron imagenes de ese auto");
            alert.show();
        }
    }
}