package EstructuraLineales;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada listaEnlazada=new ListaEnlazada();
        listaEnlazada.insertar( new Cancion("Navidad", "./navidad.mp3",65));
        listaEnlazada.insertar( new Cancion("Navidad2", "./navidad.mp3",65));
        listaEnlazada.insertar( new Cancion("Navidad3", "./navidad.mp3",65));
        listaEnlazada.mostrarElementos();
        LinkedList<Cancion> listaJava= new LinkedList<>();
        listaJava.add(new Cancion("asasasa","asasassa",65));
        listaJava.add(new Cancion("asasasa2","asasassa",65));
        listaJava.add(new Cancion("asasasa3","asasassa",65));
        for (int x=0;x<listaJava.size();x++) {
            Cancion c = listaJava.get(x);
            System.out.println(c.getNombre());
        }



        /*
        Stack<Usuario> pila=new Stack<>();
        Stack<Integer> pila2=new Stack<>();
        Queue<Usuario> cola=new LinkedList<>();
        pila.add( new Usuario("Jesús", "Ave. Benito Juarez", "123456789"));
        pila.add( new Usuario("Tadeo", "Calle Emiliano Zapata", "147258369"));
        pila.add( new Usuario("Luis", "Ave. Tecnologica", "258147369"));
        Usuario cachar = pila.pop();
        System.out.println(cachar.getNombre());
        cachar = pila.pop();
        System.out.println(cachar.getNombre());
        pila.pop();
        if (pila.isEmpty()) System.out.println("Pila vacía");
        pila2.add(1);
        pila2.add(2);
        pila2.add(3);
        cola.add( new Usuario("Yo", "dndjjdjdj", "188269887"));
        cola.add( new Usuario("Tu", "kdjfjjuri", "742899846"));
        cola.add( new Usuario("El", "peindjeue", "365548969"));
        Usuario usr=cola.poll();
        System.out.println(usr.getNombre());
        cola.clear();//Limpiar la cola
        pila.clear();//Limpiar la pila
        Usuario cachar2 = cola.peek();
        System.out.println(cachar2.getNombre());

         */
    }
}
