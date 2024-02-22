package Es20_ciclofor_1;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("Inserisci il numero per creare la tabellina");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        multTab(value);
    }
    public static void multTab(int value){
        for (int i = 1; i <= 10; i++){
            System.out.println(value + "x" + i + " = " + value * i);
        }
    }
}
