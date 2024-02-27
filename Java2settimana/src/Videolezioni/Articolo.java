package Videolezioni;

public class Articolo {
    private final String nome;
    private final double prezzo;
    private final double iva;

    public Articolo(String nome, double prezzo, double iva) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public double getPrezzo(boolean conIva) {
        if (conIva) {
            return prezzo + prezzo * iva;
        } else {
            return prezzo;
        }


    }

    @Override
    public String toString() {
        return "Articolo{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                '}';
    }
}
