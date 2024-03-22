package es12_LinkedList;

public class Frutta {
    private String nome;

    public Frutta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Frutta{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
