package DiceGame;
import java.util.Random;
public class Dice {

    private Random random;

    public Dice(){
        this.random = new Random();
    }

    public int launch(){
        return random.nextInt(6)+1;
    }

}
