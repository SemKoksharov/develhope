package Esrecizi_plus;

public class SwitchArray2d {
    public static void main(String[] args) {
        int matrix[][] = {
                //columns
                {1,2,3,5,6}, // row
                {7,8,9,8,0}, // row
                {0,9,8,7,6}// row

        };
        int[][] switchedMatrix = switchMatrix(matrix);
        System.out.println("Original matrix:");
        printMatrix(matrix);

        System.out.println("\n\nSwitched matrix:");
        printMatrix(switchedMatrix);



    }

    //                               [col]/[row]
    public static int[][] switchMatrix(int[][] someMatrix) {

        int columns = someMatrix[0].length;
        int rows = someMatrix.length;
        int[][] switchedMatrix = new int[columns][rows];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                switchedMatrix[col][row] = someMatrix[row][col];
            }
        }
        return switchedMatrix;
    }

    public static void printMatrix(int[][] someMatrix) {
        for (int row = 0; row < someMatrix.length; row++) {
            System.out.println();
            for (int col = 0; col < someMatrix[row].length; col++) {
                System.out.print("   "+someMatrix[row][col] + " ");
            }

        }
    }

}

