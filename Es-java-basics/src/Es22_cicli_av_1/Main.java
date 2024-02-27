package Es22_cicli_av_1;

public class Main {
    public static void main(String[] args){
        forInterrupt(30);
    }
   private static void forInterrupt(int entredValue){
        for (int i = 0; i <= entredValue; i++){
            if (i == 5){
                break;
            }
            System.out.println("Valore attuale = " + i);
        }
    }
}

