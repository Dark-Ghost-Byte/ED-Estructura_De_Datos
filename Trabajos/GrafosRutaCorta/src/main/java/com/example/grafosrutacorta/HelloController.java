package com.example.grafosrutacorta;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML ComboBox comboC1;
    @FXML ComboBox comboC2;
    @FXML ComboBox comboCal1;
    @FXML ComboBox comboCal2;
    @FXML TextField txtDistancia;
    @FXML Label lblRespuesta;

    Grafo grafo = new Grafo("abcdefgh");

    @FXML protected void initialize(){
        comboC1.getItems().addAll(
                "a - NUEVO CASAS GRANDES",
                "b - JANOS",
                "c - ASENCION",
                "d - JUAREZ",
                "e - CHIHUAHUA",
                "f - VALLE",
                "g - BUENAVENTURA",
                "h - VILLA AHUMADA");
        comboC2.getItems().addAll(
                "a - NUEVO CASAS GRANDES",
                "b - JANOS",
                "c - ASENCION",
                "d - JUAREZ",
                "e - CHIHUAHUA",
                "f - VALLE",
                "g - BUENAVENTURA",
                "h - VILLA AHUMADA");
        comboCal1.getItems().addAll(
                "a - NUEVO CASAS GRANDES",
                "b - JANOS",
                "c - ASENCION",
                "d - JUAREZ",
                "e - CHIHUAHUA",
                "f - VALLE",
                "g - BUENAVENTURA",
                "h - VILLA AHUMADA");
        comboCal2.getItems().addAll(
                "a - NUEVO CASAS GRANDES",
                "b - JANOS",
                "c - ASENCION",
                "d - JUAREZ",
                "e - CHIHUAHUA",
                "f - VALLE",
                "g - BUENAVENTURA",
                "h - VILLA AHUMADA");
    }

    public void crearNodo(ActionEvent event){
        String c1=comboC1.getSelectionModel().getSelectedItem().toString();
        String c2=comboC2.getSelectionModel().getSelectedItem().toString();
        int distancia=Integer.parseInt(txtDistancia.getText());
        grafo.agregarRuta(c1.toCharArray()[0], c2.toCharArray()[0],distancia);
        txtDistancia.setText("");
    }

    public void calcularRuta(ActionEvent event){
        char inicio = comboCal1.getSelectionModel().getSelectedItem().toString().toCharArray()[0];
        char fin = comboCal2.getSelectionModel().getSelectedItem().toString().toCharArray()[0];
        String respuesta = grafo.encontrarRutaMinimaDijkstra(inicio,fin);
        String km=respuesta.split(":")[0];
        String cuidades=respuesta.split(":")[1];
        cuidades=cuidades.replace("a","NUEVO CASAS GRANDES");
        cuidades=cuidades.replace("b","JANOS");
        cuidades=cuidades.replace("c","ASENCION");
        cuidades=cuidades.replace("d","JUAREZ");
        cuidades=cuidades.replace("e","CHIHUAHUA");
        cuidades=cuidades.replace("f","VALLE");
        cuidades=cuidades.replace("g","BUENAVENTURA");
        cuidades=cuidades.replace("h","VILLA AHUMADA");
        System.out.println("PASANDO POR: "+cuidades+".");
        System.out.println("CON UNA DISTANCIA DE: "+km+" KM.");
        lblRespuesta.setText("LA RUTA MAS CORTA ES: "+respuesta);
    }
}