package Esrecizi_plus;

public class ReverseString {
    public static void main(String[] args) {
        String myText = "VAFANCULOOO SCEMO";
        System.out.println(solution(myText));
        System.out.println("Solution 2 best: "+ solution2("ПидорСкая ШлюХа!"));
    }

    public static String solution(String str) {
        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String solution2(String str) {
        return new StringBuilder(str).reverse().toString();
    }



}