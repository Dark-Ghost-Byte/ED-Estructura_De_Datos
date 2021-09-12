import java.util.Scanner;

public class Funciones_de_tarea {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduce el diametro del circulo:");
        int n = scanner.nextInt();
        double resultado= area(n);
        System.out.println("La area del circulo es: "+resultado);
        double res= perimetro(n);
        System.out.println("El perimetro del circulo es: "+res);

        System.out.println("");
        System.out.println("PENDIENTE DE LA RECTA.");
        System.out.println("Introduce y1:");
        int y1= scanner.nextInt();
        System.out.println("Introduce y2:");
        int y2= scanner.nextInt();
        double rectaResy=rectaY(y1, y2);
        System.out.println("El resutado es: " + rectaResy);
        System.out.println("Introduce x1:");
        int x1= scanner.nextInt();
        System.out.println("Introduce x2:");
        int x2= scanner.nextInt();
        double rectaResx=rectaX(x1, x2);
        System.out.println("El resultado es: "+rectaResx);
        System.out.println("El resultado de la pendiente de la recta ((y2-y1)/(x2-x1)) es: "+(rectaResy/rectaResx));

        System.out.println("");
        System.out.println("FORMULA GENERAL.");
        System.out.println("Introduce a:");
        int a= scanner.nextInt();
        System.out.println("Introduce b:");
        int b= scanner.nextInt();
        System.out.println("Introduce c:");
        int c= scanner.nextInt();
        double formulaRespos= formulaGeneralpositivo(a, b, c);
        System.out.println("Resultado de la formula general positiva: "+formulaRespos);
        double formulaResneg= formulaGeneralnegativa(a, b, c);
        System.out.println("Resultado de la formula general negativa: "+formulaResneg);


        System.out.println("");
        System.out.println("HORA.");
        System.out.println("Introduce la hora (Del 1 al 12):");
        int hora= scanner.nextInt();
        System.out.println("Introduce los minutos:");
        int minutos= scanner.nextInt();
        System.out.println("Introduce si es am o pm:");
        String horario= scanner.next();
        int horaEstablecida= hora(hora);
        int minutosEstablecitos=minutos(minutos);
        System.out.println("Son las "+horaEstablecida+" con "+minutosEstablecitos+" minutos");
        System.out.println(horaEstablecida+":"+minutosEstablecitos+" "+horario);





    }//Llave del main

    public static double area(int num){

        return num / 2 * Math.PI;
    }//Llave de la area

    public static double perimetro(int num){

        return (2*Math.PI) * (num/2);
    }//Llave del perimetro

    public static double rectaY(int num1, int num2){

        return num2 - num1;
    }//Llave de la recta y

    public static double rectaX(int num1, int num2){

        return num2 - num1;
    }//Llave de la recta x

    public static double formulaGeneralpositivo(double num1, double num2, double num3){
        double q=-(num2);
        double w=Math.pow(num2,2)-4*num1*num3;
        double e=num1;
        return (q+w)/2*e;

    }//Llave de la formula general positiva

    public static double formulaGeneralnegativa(double num1, double num2, double num3){
        double q=-(num2);
        double w=Math.pow(num2,2)-4*num1*num3;
        double e=num1;
        return (q-w)/2*e;

    }//Llave de la formula general negativa

    public static int hora(int hora){
       return hora;
    }//Llave de la hora

    public static int minutos(int min) {
        return min;
    }//Llave de los minutos


}//Llave de la clase
