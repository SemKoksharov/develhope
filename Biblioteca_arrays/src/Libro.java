
public class Libro {
    private String titolo;
    private String autore;
    private int annoDiPublic;
    private double prezzo;
    private String descrizione;

    public Libro(String titolo, String autore, int annoDiPublic, double prezzo, String descrizione) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoDiPublic = annoDiPublic;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
    }

    public Libro(String titolo, String autore, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnnoDiPublic() {
        return annoDiPublic;
    }

    public void setAnnoDiPublic(int annoDiPublic) {
        this.annoDiPublic = annoDiPublic;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", annoDiPublic=" + annoDiPublic +
                ", prezzo=" + prezzo +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }

    public void infoDiLibro() {
        System.out.println("### Libro info### \n" +
                "Titolo&Autore:" + getTitolo() + " " + getAutore() + "\nPrezzo: " + getPrezzo());
    }
    public static void confrontaLibri(Libro libro1, Libro libro2) {
        if (libro1.getAnnoDiPublic() < libro2.getAnnoDiPublic()) {
            System.out.println("Il libro " + libro1.getAutore() + " " + libro1.getTitolo() + "è più vecchio del libro " +
                    libro2.getAutore() + " " + libro2.getTitolo());
        } else {
            System.out.println("Il libro " + libro2.getAutore() + " " + libro2.getTitolo() + "è più vecchio del libro " +
                    libro1.getAutore() + " " + libro1.getTitolo());
        }
    }
}
