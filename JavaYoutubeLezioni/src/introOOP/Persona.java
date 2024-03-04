package introOOP;

public class Persona {
    String nome;
    String cognome;
    int eta;
    String colorePreferito;
    static int numeroPersone;

    Persona(String nome, String cognome, int eta, String colorePreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
        numeroPersone++;
    }

    void saluto(){
        System.out.println("Ciao, sono " + this.nome);
    }

    void routoier(){
        System.out.println(this.cognome);
    }



    void addizione(int a, int b){
        int risultato = a+b;
        System.out.println("Il risultato `e" + risultato);
        System.out.println("da addizione "+ this.nome);
        this.qwerty(risultato);
    }

    void qwerty(int prova){
        System.out.println("da qwerty "+ prova);
    }

    @Override
    public String toString(){
        String stringa = this.nome +"\n"+this.cognome+"\n"+this.eta+"\n"+this.colorePreferito;
        return stringa;
    }

    void saluta(Persona personaDaSalutare){
        System.out.println("Ciao " + personaDaSalutare.nome+" io sono "+this.nome);
    }

    static void mostraNumPersone(){
        System.out.println("Numero persone: "+numeroPersone);
    }
}

