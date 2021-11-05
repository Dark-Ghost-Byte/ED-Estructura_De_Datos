package com.example.proyectou2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PedidosController {
    @FXML Label lblUsuario;

    @FXML TextField txtNombre, txtProducto, txtFecha;

    @FXML
    TableView tableView;
    TableColumn colNombre=new TableColumn("Cliente");
    TableColumn colProducto=new TableColumn("Producto");
    TableColumn colFecha=new TableColumn("Fecha");
    Queue<Pedido> colaPedido=new LinkedList<>();
    ObservableList<Pedido> filas= FXCollections.observableArrayList();

    @FXML protected void initialize(){
        lblUsuario.setText(HelloApplication.usuario);
        colFecha.setMinWidth(200);
        colNombre.setCellValueFactory( new PropertyValueFactory<Pedido, String>("cliente"));
        colProducto.setCellValueFactory( new PropertyValueFactory<Pedido, String>("producto"));
        colProducto.setMinWidth(300);
        colFecha.setCellValueFactory( new PropertyValueFactory<Pedido, String>("fecha"));


        tableView.setItems(filas);
        tableView.getColumns().addAll(colNombre, colProducto, colFecha);
    }

    public void insertarPedido(ActionEvent event){
        if (!txtNombre.getText().equals("") && !txtFecha.getText().equals("") && !txtProducto.getText().equals("")){
            Pedido pedido= new Pedido(txtNombre.getText(), txtProducto.getText(), txtFecha.getText());
            filas.add(pedido);
            colaPedido.add(pedido);
        }else {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Favor de llenar todos los campos.");
            alert.show();
        }
    }//llave funcion

    public void entregarPedido(){
        if (!tableView.equals("")){
            Pedido entregado = colaPedido.poll();
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Se ha entregado el pedido: \n Cliente: "+
                    entregado.getCliente()+"\n Productos: "+
                    entregado.getProducto());
            alert.show();
            filas.remove(0);
        }else {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Favor de llenar todos los campos.");
            alert.show();
        }

    }
}
