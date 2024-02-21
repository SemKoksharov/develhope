package Es7_aritm_1;

public class Main {
    public static void main(String args[]){
        int num1 = 12;
        int num2 = 7;
        System.out.println("Resultato di divisione col resto = " + retResto(num1,num2));
    }
    public static int retResto(int num1, int num2){
        int resto = num1 % num2;
        return resto;
    }
}
