public class Principal {
    public static void main(String[] args) {
        /*
        Elemento hidrogeno=new Elemento("Hidrogeno", "H", 1);
        Elemento e2=new Elemento("Helio", "He", 2);
        Elemento litio=new Elemento("Litio", "Li", 3);
        Elemento oxigeno=new Elemento("Oxigeno", "O", 8);
        Elemento azufre=new Elemento("Azufre", "S", 16);
        Molecula oxioL = new Molecula("Oxido de Litio",litio,2,oxigeno,1);
        Molecula sulfirico = new Molecula("Acido sulfurico",hidrogeno,2,azufre,1,oxigeno,4);
         */
        //Metales alcalinos
        Elemento litio=new Elemento("Litio", "Li", 3);
        Elemento sodio=new Elemento("Sodio", "Na", 11);
        Elemento potasio=new Elemento("Potasio", "K", 19);
        Elemento rubidio=new Elemento("Rubidio", "Rb", 37);
        Elemento cesio=new Elemento("Cesio", "Cs", 55);

        //Alcalinoterreos
        Elemento berilio=new Elemento("Berilio", "Be", 4);
        Elemento magnesio=new Elemento("Magnesio", "Mg", 12);
        Elemento calcio=new Elemento("Calcio", "Ca", 20);
        Elemento estroncio=new Elemento("Estroncio", "Sr", 38);
        Elemento bario=new Elemento("Bario", "Ba", 56);

        //Otros metales
        Elemento aluminio=new Elemento("Aluminio", "Al", 13);
        Elemento galio=new Elemento("Galio", "Ga", 31);
        Elemento indio=new Elemento("Indio", "In", 49);
        Elemento estaño=new Elemento("Estaño", "Sn", 50);
        Elemento talio=new Elemento("Talio", "Tl", 81);

        //Metales de transicion
        Elemento escandio=new Elemento("Escandio", "Sc", 21);
        Elemento titanio=new Elemento("Titanio", "Ti", 22);
        Elemento vanadio=new Elemento("Vanadio", "V", 23);
        Elemento cromo=new Elemento("Cromo", "Cr", 24);
        Elemento manganeso=new Elemento("Manganeso", "Mn", 25);

        //Lantanidos
        Elemento lantano=new Elemento("Lantano", "L<a", 57);
        Elemento cerio=new Elemento("Cerio", "Ce", 57);
        Elemento praseodimio=new Elemento("Praseodimio", "Pr", 59);
        Elemento neodimio=new Elemento("Neodimio", "Nd", 60);
        Elemento prometio=new Elemento("Prometio", "Pm", 61);

        //Actinidos
        Elemento actinio=new Elemento("Actinio", "Ac", 89);
        Elemento torio=new Elemento("Torio", "Th", 90);
        Elemento protactimio=new Elemento("Protactimio", "Pa", 91);
        Elemento uranio=new Elemento("Uranio", "U", 92);
        Elemento neptunio=new Elemento("Neptunio", "Np", 93);

        //Metaloides
        Elemento boro=new Elemento("Boro", "B", 5);
        Elemento silicio=new Elemento("Silicio", "Si", 14);
        Elemento germanio=new Elemento("Germanio", "Ge", 32);
        Elemento arsenico=new Elemento("Arsenico", "As", 33);
        Elemento antimonio=new Elemento("Antimonio", "Sb", 51);

        //No metales
        Elemento hidrogeno=new Elemento("Hidrogeno", "H", 1);
        Elemento carbono=new Elemento("Carbono", "C", 6);
        Elemento nitrogeno=new Elemento("Nitrogeno", "N", 7);
        Elemento oxigeno=new Elemento("Oxigeno", "O", 8);
        Elemento fosforo=new Elemento("Fosforo", "P", 15);

        //Halogenos
        Elemento fluor=new Elemento("Fluor", "F", 9);
        Elemento cloro=new Elemento("Cloro", "Cl", 17);
        Elemento bromo=new Elemento("Bromo", "Br", 35);
        Elemento yodo=new Elemento("Yodo", "I", 53);
        Elemento astato=new Elemento("Astato", "At", 85);

        //Gases nobles
        Elemento helio=new Elemento("Helio", "He", 2);
        Elemento neon=new Elemento("Neon", "Ne", 10);
        Elemento argon=new Elemento("Argon", "Ar", 18);
        Elemento kripton=new Elemento("Kripton", "Kr", 36);
        Elemento xenon=new Elemento("Xenon", "Xe", 54);

        Familia meAl = new Familia("Metal Alcalinos",litio,sodio,potasio,rubidio,cesio);
        Familia alca = new Familia("Alcalinotérreos",berilio,magnesio,calcio,estroncio,bario);
        Familia otMe = new Familia("Otros Metales",aluminio,galio,indio,estaño,talio);
        Familia meTra = new Familia("Metales De Transición",escandio,titanio,vanadio,cromo,manganeso);
        Familia lant = new Familia("Lantánidos",lantano,cerio,praseodimio,neodimio,prometio);
        Familia acti = new Familia("Actínidos",actinio,torio,protactimio,uranio,neptunio);
        Familia meta = new Familia("Metaloides",boro,silicio,germanio,arsenico,antimonio);
        Familia noMe = new Familia("No Metales",hidrogeno,carbono,nitrogeno,oxigeno,fosforo);
        Familia halo = new Familia("Halógenos",fluor,cloro,bromo,yodo,astato);
        Familia gaNo = new Familia("Gases Nobles",helio,neon,argon,kripton,xenon);

        System.out.println(meAl);
        System.out.println(alca);
        System.out.println(otMe);
        System.out.println(meTra);
        System.out.println(lant);
        System.out.println(acti);
        System.out.println(meta);
        System.out.println(noMe);
        System.out.println(halo);
        System.out.println(gaNo);

    }
}
