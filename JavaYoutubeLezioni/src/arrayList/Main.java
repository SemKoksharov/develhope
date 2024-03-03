package arrayList;

import java.util.ArrayList;

/*Le arraylist sono array rideminsionabili, accettano pero solo reference
Creare un ArrayList
Aggiungere elementi add()
Mandare a schermo elementi get()
Modificare elementi set()
Rimouvere elementi remove(), clear()
ArrayList 2D
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> persone = new ArrayList<String>();
        persone.add("Luca");
        persone.add("Marco");
        persone.add("Anna");

        for (int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i)); //mando allo schermo ArrayList
        }
        System.out.println('\n' + persone.get(0) + '\n'); //mando allo schermo elemento con ind 0

        persone.set(2, "Paola"); // cambio elemento con ind 2
        for (int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i)); //mando allo schermo ArrayList
        }
        persone.remove(2); // remouvere elemento ind 2
        for (int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i)); //mando allo schermo ArrayList
        }

        persone.clear(); // pulisco array
        // ArrayList 2D
        System.out.println("ArrayList 2D\n");
        ArrayList<ArrayList<String>> classi = new ArrayList<>();
        ArrayList<String> classe1 = new ArrayList<String>();
        classe1.add("Luca");
        classe1.add("Marco");

        ArrayList<String> classe2 = new ArrayList<String>();
        classe2.add("Anna");
        classe2.add("Orazio");

        classi.add(classe1);
        classi.add(classe2);

        for (int i = 0; i < classi.size(); i++) {
            System.out.println();
            for (int j = 0; j < classi.get(i).size() ; j++) {
                System.out.println(classi.get(i).get(j)+ " ");
            }

        }


    }
}

