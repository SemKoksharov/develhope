package Esrecizi_plus;

public class Es3 {
    public static void main(String[] args) {
        System.out.println(isLove(4,3));
    }

    public static boolean isLove(final int flower1, final int flower2) {
        boolean result = false;
        if (flower1 % 2 != flower2 % 2) {
            result = true;
        }
        return result;
    }
}