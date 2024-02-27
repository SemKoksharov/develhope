package Es21_ciclofor_2;

public class Main {
    public static void main(String[] args){
        int value = 13;
        int maxQuantity = 6;

       revers(value, maxQuantity);
    }
    public static void revers(int value, int maxQuantity){
        for (int i = 0; i < maxQuantity; i++){
            System.out.println(value);
            value--;
        }
    }
}
