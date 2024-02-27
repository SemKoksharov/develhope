package Es19_while;

public class Main {
    public static void main(String[] args){
        System.out.println(sum(5));
    }
    public static int sum(int limit){
        int result = 0;
        int i = 0;
        while (i < limit){
            result += i;
            i++;
        }
        return result;
    }
}
