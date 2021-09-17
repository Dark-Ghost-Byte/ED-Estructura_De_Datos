public class Elemento {
    private String nombre;
    private String simbolo;
    private int n_atomico;

    //CONSTRUCTORRRR
    public Elemento(String n, String s, int na){
        this.nombre=n;
        this.simbolo=s;
        this.n_atomico=na;
    }

    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getN_atomico() {
        return n_atomico;
    }

    public void setN_atomico(int n_atomico) {
        this.n_atomico = n_atomico;
    }


}
