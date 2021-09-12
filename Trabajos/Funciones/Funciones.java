public class Funciones {
    public static void main(String[] args) {
        int mandar=10;
        double cachar= calcular(mandar);
        System.out.println(cachar);

        nada();

        text(1);
        text(1,10);

    }//Llave del main

    public static void text (int n){
        System.out.println(n);
    }//Llave del text con un parametro

    public static void text (int n, int n2){
        System.out.println(n * n2);
    }//Llave del text con dos parametros

    /*Recibe y regresa*/
    public static double calcular(int num){
        double retorn=num * Math.PI;
        return retorn;
    }//Llave de calcular

    /*No recibe pero regresa*/
    public String ayHola(){
        return "Hola";
    }//Llave de ayHola

    /*Recibe pero no regresa*/
    public void pagar(double sueldo){
        double pago = sueldo *7;
    }//Llave de pagar

    /*No recibe y no regresa*/
    public static void nada(){
        System.out.println("Nada");
    }//Llave de nada


}//Llave de la clase

