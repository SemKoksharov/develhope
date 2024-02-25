package Es666;
import java.util.Arrays;
public class Main {
    public static void main(String args[]) {
        int[] arrayNumbers = {1, 2, 3, 5, 7, 3, 8, 0, 4, 2, 78, 9, 3, 1,};
        findDoubles(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));
    }
    public static void findDoubles(int[] somArr){
        for (int i = 0; i < somArr.length -1; i++) {
            if (somArr[i] != -1){
                for (int j = i + 1; j < somArr.length; j++) {
                    if (somArr[i] == somArr[j]){
                        somArr[j] = 666;
                    }

                }
            }
        }
    }
}
