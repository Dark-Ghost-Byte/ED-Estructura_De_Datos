package com.example.ordenamiento;

public class Metodos {
    public int[] burbuja(int[] array){
        int i, j, aux;
        for (i=0;i< array.length;i++){
            for (j=0;j< array.length-1;j++){
                if (array[j+1] < array[j]){
                    aux=array[j+1];
                    array[j+1]=array[j];
                    array[j]=aux;
                }//LLAVE IF
            }//LLAVE FOR 2
        }//LLAVE FOR 1
        return array;
    }
}
