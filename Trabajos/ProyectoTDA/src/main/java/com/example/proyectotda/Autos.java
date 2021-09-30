package com.example.proyectotda;

public class Autos {
    private String nombre;
    private int cilindros;
    private String color;
    private String marca;
    private int precio;

    public Autos(String nombre, int cilindros, String color, String marca, int precio) {
        this.nombre = nombre;
        this.cilindros = cilindros;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
