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
 */
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Luca","Rossi",25,"Blue" );
        Persona persona2 = new Persona("Marco","Verdi",35,"Rosso");
        System.out.println(persona1.cognome);
        System.out.println(persona2.cognome);
    }
}
