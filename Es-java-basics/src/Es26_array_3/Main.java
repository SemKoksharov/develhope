package Es26_array_3;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        int[] numbers = { 8, 2, 3, 2, -5, -1, 0, 3, 6 };
        findDouble(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void findDouble(int[] someArray){
        for (int i = 0; i < someArray.length - 1; i++)
            if (someArray[i] != -1){
                for (int j = i +1; j< someArray.length; j++){
                    if (someArray[j] == someArray[i]){
                        someArray[j] = -1;
                    }
                }
            }
    }
}

