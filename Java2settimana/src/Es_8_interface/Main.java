package Es_8_interface;

/* HO MESSO INTERFACE DETRO DI CARTELLA interfaceForma!!!
   X aver possibilita di  creare anche classe con stesso nome (Forma)
  */

public class Main {
    public static void main(String[] args) {
        //nuova forma generica(poligono)
        Forma poligono = new Forma(54, 27.3, 58.666);
        poligono.calcolaArea();

        //rettangolo

        Rettangolo rettangolo = new Rettangolo(12, 25.8);
        rettangolo.calcolaArea();

        //treangolo

        Treangolo treangolo = new Treangolo(10, 7);
        treangolo.calcolaArea();
        System.out.println();
        System.out.print(treangolo.getAltezza()); // stampo altezza

        treangolo.setAltezza(5); // cambio altezza
        System.out.println();

        System.out.print(treangolo.getAltezza()); // stampo altezza mod.

        treangolo.calcolaArea(); // stampo area di triangolo mod.
    }

}
