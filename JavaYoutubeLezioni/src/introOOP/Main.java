package introOOP;

/*
INTRO OOP
cos`e la programmazione ad oggetti
classi metodi e attributi
classe con file esterno
cosa sono gli ogetti e le istanze di classe
usare attributi e metodi
Construttore
parole this
Scope
Overloaded
 */
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Luca", "Rossi", 25, "Blue");
        Persona persona2 = new Persona("Marco", "Verdi", 35, "Rosso");
        Persona persona3 = new Persona("Anna", "Neri", 23, "Giallo");
        Persona persona4 = new Persona("Andrey", "Petrov", 55, "Nero");
        Persona persona5=new Persona("Alla","Pugacheva", 74, "Verde" );
        System.out.println(persona1.cognome);
        System.out.println(persona2.cognome);

        persona1.saluto();
        persona2.saluto();
        persona2.addizione(2, 3);

     /* addizione(int a, int b);
       addizione(int a, int b, int c);
       addizione(double a, double b;)

      */


        Pizza pizza1 = new Pizza("Integrale", "Pomodoro", "Mozarella", "Ananas");
        Pizza pizza2 = new Pizza("5 cereali");
        Pizza pizza3 = new Pizza("Normale", "Pomodoro", "Mozarella", "Ananas");
        Pizza pizza4 = new Pizza("Normale", "Bianco", "Mozarella,", "gorgonzola", "patatine");


        System.out.println("\n" + persona1);

     /*   Persona[] persone = new Persona[3];

        persone[0] = persona1;
        persone[1] = persona2;
        persone[2] = persona3;

      */

        Persona[] persone = {persona1, persona2, persona3};

        System.out.println("\n" + persone[0]);
        System.out.println("\n" + persone[1]);
        System.out.println("\n" + persone[2]);


        persona2.saluta(persona4);

        System.out.println("Numero persone: " + Persona.numeroPersone);

        Persona.mostraNumPersone();
    }


}
