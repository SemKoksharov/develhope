package Es4_inheritance;

public abstract class Animale {
    private String nome;

    Animale(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    abstract void failVerso();
}
