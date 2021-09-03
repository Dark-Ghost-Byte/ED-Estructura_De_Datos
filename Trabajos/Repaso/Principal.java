import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*
        int x=0;
        String y="Holi";
        boolean entro=false;
        char letra= 'a';

        Scanner scanner= new Scanner(System.in);
        System.out.println("Dame un numero.");
        int num = scanner.nextInt();
        double res= num * Math.PI;
        System.out.println("El resultado es: "+ res);
         */
        System.out.println("Introduce 6 numeros.");
        Scanner scanner=new Scanner(System.in);
        int arreglo[]=new int[3];
        arreglo[0]=10;
        arreglo[1]=20;
        arreglo[2]=30;
        //String arregloBidi[][]=new String[3][2];
        int arregloBidi[][]=new int[3][2];
        arregloBidi[0][0]= 10;
        arregloBidi[0][1]= 5;
        arregloBidi[1][0]= 20;
        arregloBidi[1][1]= 10;
        arregloBidi[2][0]= 30;
        arregloBidi[2][1]= 15;

        for (int x=0;x<arregloBidi.length;x++){
            for (int y=0;y<2;y++){
                System.out.println("Los numeros de los arreglos estrablecidos son: " + arregloBidi[x][y]);
                System.out.println("Suma: " + arregloBidi[x][y] + arregloBidi[x][y]);
            }//Llave del segundo for
        }//Llave del primer for




    }//Llave de main
}//Llave de la clase
