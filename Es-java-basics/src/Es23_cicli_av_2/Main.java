package Es23_cicli_av_2;

public class Main {
    public static void main(String args[]){
        jumpOver5(17);
    }
    private static void jumpOver5(int entredValue){
        for (int i = 0; i <= entredValue; i++){
            if (i == 5){
                continue;
            }
            System.out.println("Valore attuale = " + i);
        }
    }
}