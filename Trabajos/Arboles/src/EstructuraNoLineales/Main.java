package EstructuraNoLineales;

public class Main {
    public static void main(String[] args) {
        Arbol arbol= new Arbol();
        arbol.insertar(43);
        arbol.insertar(10);
        arbol.insertar(8);
        arbol.insertar(54);
        arbol.insertar(15);
        arbol.insertar(50);
        arbol.insertar(53);
        System.out.println("INORDE: ");
        arbol.dispararInorden();
        System.out.println();
        System.out.println("POSTORDEN: ");
        arbol.dispararPostorden();
        System.out.println();
        System.out.println("PREORDEN: ");
        arbol.dispararPreorden();
    }
}
