package Algoritmos;

public class Buscar {

    public int busquedad(char c, char[]arreglos, int cont){
        int pos=-1;
        if (cont==arreglos.length) {return -1;}
        if (arreglos[cont]==c){ pos=cont; }
        if (pos > -1){ return pos;} else {
            return busquedad(c,arreglos,cont+1);
        }

    }//Llave funcion
}
