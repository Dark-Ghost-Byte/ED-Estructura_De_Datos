public class Familia {
    private String nombre;
    private Elemento elemento1;
    private Elemento elemento2;
    private Elemento elemento3;
    private Elemento elemento4;
    private Elemento elemento5;

    public Familia(String nombre, Elemento elemento1) {
        this.nombre = nombre;
        this.elemento1 = elemento1;
    }

    public Familia(String nombre, Elemento elemento1, Elemento elemento2) {
        this.nombre = nombre;
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
    }

    public Familia(String nombre, Elemento elemento1, Elemento elemento2, Elemento elemento3) {
        this.nombre = nombre;
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
        this.elemento3 = elemento3;
    }

    public Familia(String nombre, Elemento elemento1, Elemento elemento2, Elemento elemento3, Elemento elemento4) {
        this.nombre = nombre;
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
        this.elemento3 = elemento3;
        this.elemento4 = elemento4;
    }

    public Familia(String nombre, Elemento elemento1, Elemento elemento2, Elemento elemento3, Elemento elemento4, Elemento elemento5) {
        this.nombre = nombre;
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
        this.elemento3 = elemento3;
        this.elemento4 = elemento4;
        this.elemento5 = elemento5;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Elemento getElemento1() {
        return elemento1;
    }

    public void setElemento1(Elemento elemento1) {
        this.elemento1 = elemento1;
    }

    public Elemento getElemento2() {
        return elemento2;
    }

    public void setElemento2(Elemento elemento2) {
        this.elemento2 = elemento2;
    }

    public Elemento getElemento3() {
        return elemento3;
    }

    public void setElemento3(Elemento elemento3) {
        this.elemento3 = elemento3;
    }

    public Elemento getElemento4() {
        return elemento4;
    }

    public void setElemento4(Elemento elemento4) {
        this.elemento4 = elemento4;
    }

    public Elemento getElemento5() {
        return elemento5;
    }

    public void setElemento5(Elemento elemento5) {
        this.elemento5 = elemento5;
    }
}
