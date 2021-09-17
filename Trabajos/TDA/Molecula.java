public class Molecula {
    private String nombre;
    private Elemento elemento1;
    private int nAelemento1;
    private Elemento elemento2;
    private int nAelemento2;
    private Elemento elemento3;
    private int nAelemento3;

    //CONSTRUCTOR 1
    public Molecula(String nombre, Elemento elemento1, int nAelemento1, Elemento elemento2, int nAelemento2) {
        this.nombre = nombre;
        this.elemento1 = elemento1;
        this.nAelemento1 = nAelemento1;
        this.elemento2 = elemento2;
        this.nAelemento2 = nAelemento2;
    }

    //CONSTRUCTOR 2
    public Molecula(String nombre, Elemento elemento1, int nAelemento1, Elemento elemento2, int nAelemento2, Elemento elemento3, int nAelemento3) {
        this.nombre = nombre;
        this.elemento1 = elemento1;
        this.nAelemento1 = nAelemento1;
        this.elemento2 = elemento2;
        this.nAelemento2 = nAelemento2;
        this.elemento3 = elemento3;
        this.nAelemento3 = nAelemento3;
    }
}
