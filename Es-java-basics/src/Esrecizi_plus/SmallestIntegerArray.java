package Esrecizi_plus;

import java.util.Arrays;

public class SmallestIntegerArray {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 3, 2, -5000, -1, 0, 3, 6};

        System.out.println(smallestInt(numbers));
        System.out.println(findSmallestInt(numbers));
    }

    public static int smallestInt(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) min = numbers[i];

        }
        return min;
    }

    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }


}
