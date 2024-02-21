package Es11_conf_1;

public class Main {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 20;

        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Numeri sono diversi? " + numeriDiversi(num1, num2));
    }

    public static boolean numeriDiversi(int num1, int num2) {
        return num1 != num2;
    }
}
