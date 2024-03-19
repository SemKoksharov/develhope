package es10_ArrayList_1;

public class Studente {
    private String nome;
    private int age;

    public Studente(String nome, int age) {
        this.nome = nome;
        this.age = age;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", age=" + age +
                '}';
    }

}
