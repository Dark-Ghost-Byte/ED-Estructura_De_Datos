package EstructuraNoLineales;

public class Arbol {
    NodoArbol inicial;
    public  Arbol(){
        this.inicial=null;
    }
    public void insertar(int valor){
        if (this.inicial == null){
            this.inicial = new NodoArbol(valor);
        }else {
            this.inicial.insertar(valor);
        }
    }
    public void dispararPreorden(){
        this.preoden(this.inicial);
    }
    public void preoden(NodoArbol nodo){
        if (nodo == null){
            return;//DETENER RECURSIVIDASD CASO BASE
        }else {
            System.out.print(nodo.getValor()+", ");
            preoden(nodo.getNodoIzq());
            preoden(nodo.getNodoDer());
        }
    }

    public void dispararInorden(){
        this.inorden(this.inicial);
    }
    public void inorden(NodoArbol nodo){
        if (nodo == null){
            return;//DETENER RECURSIVIDASD CASO BASE
        }else {
            inorden(nodo.getNodoIzq());
            System.out.print(nodo.getValor()+", ");
            inorden(nodo.getNodoDer());
        }
    }

    public void dispararPostorden(){
        this.postorden(this.inicial);
    }
    public void postorden(NodoArbol nodo){
        if (nodo == null){
            return;//DETENER RECURSIVIDASD CASO BASE
        }else {
            postorden(nodo.getNodoIzq());
            postorden(nodo.getNodoDer());
            System.out.print(nodo.getValor()+", ");
        }
    }
}
