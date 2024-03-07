package Esrecizi_plus;

public class GetSum {
    public static void main(String[] args) {
        System.out.println(sum(1,4)); //1+2+3+4
        System.out.println(sum(0,-1)); // 0 + (-1)
    }

    public static int sum(int a, int b){
        int res = 0;
        for (int i = a; i<=b; i++){
            res+=i;
        }
        return res;
    }
}