package Esrecizi_plus;

public class Es1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, -4, 6, 8, 4, -2, 3, -8};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr) {
        int result = 0;
        for(int num :arr){
            if(num > 0) result+= num;
        }
        return result;
    }
}
