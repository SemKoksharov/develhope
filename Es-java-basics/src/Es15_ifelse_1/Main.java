package Es15_ifelse_1;

public class Main {
    public static void main(String args[]){
        for (int i = 1; i <= 100; i++ ){
            System.out.println(i + " " +controllo(i));
        }

    }
    public static String controllo(int i){
       String result = "";

       if(i % 3 == 0 && i % 5 == 0){
            result = "FizzBuzz";
        } else if (i % 3 == 0) {
            result = "Fizz";
        } else if (i % 5 == 0) {
            result = "buzz";
        }
        return result;
    }
}
