
public class Studente {
   private int numMatricola;
    private String nome;
    private String cognome;
    private String indirizzoResidenza;

    public Studente(int numMatricola, String nome, String cognome, String indirizzoResidenza) {
        this.numMatricola = numMatricola;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzoResidenza = indirizzoResidenza;
    }

    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public int getNumMatricola() {
        return numMatricola;
    }

    public void setNumMatricola(int numMatricola) {
        this.numMatricola = numMatricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzoResidenza() {
        return indirizzoResidenza;
    }

    public void setIndirizzoResidenza(String indirizzoResidenza) {
        this.indirizzoResidenza = indirizzoResidenza;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "numMatricola=" + numMatricola +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", indirizzoResidenza='" + indirizzoResidenza + '\'' +
                '}';
    }
}
