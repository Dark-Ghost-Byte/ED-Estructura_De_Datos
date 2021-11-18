package Algoritmos;

public class Encriptar {
    public String encriptar(char[]palabra, int cont){
        //CASO BASE
        if (cont == palabra.length) return "";
        return buscarCaracter(palabra[cont], 0)+encriptar(palabra, cont+1);
    }

    public char buscarCaracter(char c, int index){
        char[][] mapa={
                {'a','◘'},
                {'b','♣'},
                {'c','♥'},
                {'d','♦'},
                {'e','♠'},
        };
        //caso base
        if (index == mapa.length) return 0;
        if (mapa[index][0] == c){
            return mapa[index][1];
        } else {
            return buscarCaracter(c, index+1);
        }
    }
}
