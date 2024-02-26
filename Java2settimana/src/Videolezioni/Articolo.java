package Videolezioni;

public class Articolo {
    private final String nome;

    private final double prezzo;

    public Articolo(String nome, double prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public double getPrezzo(){
        return prezzo;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
