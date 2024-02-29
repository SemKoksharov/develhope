package Esrecizi_plus;

import java.util.Arrays;

public class Es2 {
    public static void main(String[] args) {
        int[] myArray = {2, 4, 6, 2, 7, 8, 3, 6, 4, 3, 25, 7, 8, 34, 4, 657, 666};
        System.out.println(Arrays.toString(myArray));

        arrX2(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void arrX2(int[] someArr) {
        int[] newArr = new int[someArr.length];
        for (int i = 0; i < someArr.length; i++) {
            someArr[i] = someArr[i] * 2;
        }
    }
}