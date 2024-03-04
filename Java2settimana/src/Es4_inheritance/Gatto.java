package Es4_inheritance;

public class Gatto extends Animale{
    public Gatto(String nome) {
        super(nome);
    }
    public void failVerso(){
        System.out.println( "Meow meow! Sono un gattino!");
    }
}
