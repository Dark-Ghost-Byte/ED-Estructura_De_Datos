package com.example.grafosrutacorta;
/*
* o, que va a servir para la cola de prioridad y para llevar registro de la
* distancia mínima desde el origen a un nodo, así como la referencia al
* nodo inmediatamente anterior
* Comparable contiene una método abstracta compareTo el cual permite ordenar un objeto según un atributo especificado
*  (String, Double, Integer, Int, etc), en un orden ascendente o descendente.
* http://1db3poo.blogspot.com/p/interfaz-compareble.html
* */
public class Nodo implements Comparable<Nodo> {
    char id;
    int  distancia   = Integer.MAX_VALUE;
    Nodo procedencia = null;
    Nodo(char x, int d, Nodo p) { id=x; distancia=d; procedencia=p; }
    Nodo(char x) { this(x, 0, null); }
    public int compareTo(Nodo tmp) { return this.distancia-tmp.distancia; }
    public boolean equals(Object o) {
        Nodo tmp = (Nodo) o;
        if(tmp.id==this.id) return true;
        return false;
    }
}