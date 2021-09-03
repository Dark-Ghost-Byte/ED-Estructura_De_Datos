import java.util.Scanner;

public class Principal1 {
    public static void main(String[] args) {
        System.out.println("Ejercicio de arreglos");
        Scanner scanner=new Scanner(System.in);
        int arregloBidi[][]=new int[4][4];

        arregloBidi[0][0]=10;
        arregloBidi[0][1]=2;
        arregloBidi[0][2]=4;
        arregloBidi[0][3]=10;
        int sum1= arregloBidi[0][0]+arregloBidi[0][1]+arregloBidi[0][2]+arregloBidi[0][3];
        //System.out.println(sum1);

        arregloBidi[1][0]=15;
        arregloBidi[1][1]=5;
        arregloBidi[1][2]=5;
        arregloBidi[1][3]=8;
        int sum2= arregloBidi[1][0]+arregloBidi[1][1]+arregloBidi[1][2]+arregloBidi[1][3];
        //System.out.println(sum2);

        arregloBidi[2][0]=20;
        arregloBidi[2][1]=2;
        arregloBidi[2][2]=4;
        arregloBidi[2][3]=-1;
        int sum3= arregloBidi[2][0]+arregloBidi[2][1]+arregloBidi[2][2]+arregloBidi[2][3];
        //System.out.println(sum3);

        arregloBidi[3][0]=30;
        arregloBidi[3][1]=1;
        arregloBidi[3][2]=5;
        arregloBidi[3][3]=3;
        int sum4= arregloBidi[3][0]+arregloBidi[3][1]+arregloBidi[3][2]+arregloBidi[3][3];
        //System.out.println(sum4);


        for (int x=0;x<arregloBidi.length;x++){
            for (int y=0;y<4;y++){
                System.out.println("El numero establecido para el arreglo es: " + arregloBidi[x][y]);
            }//Llave del segundo for
        }//Llave del primer for

        System.out.println("La suma de todos los numeros dentro de los arreglos son: "+(sum1+sum2+sum3+sum4));
        System.out.println("");
        System.out.println("Introduce 1 numeros:");
        int num1=scanner.nextInt();

        int mul1=num1*arregloBidi[0][0];int mul2=num1*arregloBidi[0][1];
        int mul3=num1*arregloBidi[0][2];int mul4=num1*arregloBidi[0][3];

        int mul5=num1*arregloBidi[1][0];int mul6=num1*arregloBidi[1][1];
        int mul7=num1*arregloBidi[1][2];int mul8=num1*arregloBidi[1][3];

        int mul9=num1*arregloBidi[2][0];int mul10=num1*arregloBidi[2][1];
        int mul11=num1*arregloBidi[2][2];int mul12=num1*arregloBidi[2][3];

        int mul13=num1*arregloBidi[3][0];int mul14=num1*arregloBidi[3][1];
        int mul15=num1*arregloBidi[3][2];int mul16=num1*arregloBidi[3][3];
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[0][0]+" (Arreglo[0][0]) es: "+mul1);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[0][1]+" (Arreglo[0][1]) es: "+mul2);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[0][2]+" (Arreglo[0][2]) es: "+mul3);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[0][3]+" (Arreglo[0][3]) es: "+mul4);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[1][0]+" (Arreglo[1][0]) es: "+mul5);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[1][1]+" (Arreglo[1][1]) es: "+mul6);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[1][2]+" (Arreglo[1][2]) es: "+mul7);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[1][3]+" (Arreglo[1][3]) es: "+mul8);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[2][0]+" (Arreglo[2][0]) es: "+mul9);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[2][1]+" (Arreglo[2][1]) es: "+mul10);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[2][2]+" (Arreglo[2][2]) es: "+mul11);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[2][3]+" (Arreglo[2][3]) es: "+mul12);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[3][0]+" (Arreglo[3][0]) es: "+mul13);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[3][1]+" (Arreglo[3][1]) es: "+mul14);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[3][2]+" (Arreglo[3][2]) es: "+mul15);
        System.out.println("La multiplicacion de "+num1+" y de "+arregloBidi[3][3]+" (Arreglo[3][3]) es: "+mul16);

        System.out.println("");
        System.out.println("La suma de las diagonales es:");
        int sumTotal=arregloBidi[0][0]+arregloBidi[1][1]+arregloBidi[2][2]+arregloBidi[3][3];
        System.out.println(sumTotal);
        System.out.println("La suma de las diagonales con la multiplicacion es:");
        int sumTotalmul=mul1+mul6+mul11+mul16;
        System.out.println(sumTotalmul);


    }

}

