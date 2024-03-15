public class Student {
    private int numMatricola;
    private String nome;
    private String cognome;
    private String indirizzoDiResidenza;

    public Student(int numMatricola, String nome, String cognome, String indirizzoDiResidenza) {
        this.numMatricola = numMatricola;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzoDiResidenza = indirizzoDiResidenza;
    }

    public Student(String nome, String cognome) {
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

    public String getIndirizzoDiResidenza() {
        return indirizzoDiResidenza;
    }

    public void setIndirizzoDiResidenza(String indirizzoDiResidenza) {
        this.indirizzoDiResidenza = indirizzoDiResidenza;
    }

    @Override
    public String toString() {
        return "Student {" +
                " numMatricola=" + numMatricola +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", indirizzoDiResidenza='" + indirizzoDiResidenza + '\'' +
                '}';
    }
}













