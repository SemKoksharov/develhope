package Es_28_arr2d_2;

public class Main {
    public static void main(String[] args){
        int matrix[][] = {
                //    columns
                    {6, 10, 4}, // row
                    {1, 4, 88}  // row
        };
        System.out.println("Matrice originale: ");
        printMatrix(matrix);

        int[][]resultMatrix = swapRowsWithColumns(matrix); //facciamo swap

        System.out.println("\n\nMatrice nuova");
        printMatrix(resultMatrix);

    }
    public static int [][] swapRowsWithColumns(int someMatrix[][]){
        int rows = someMatrix.length;
        int columns = someMatrix[0].length;
        int[][] resultMatrix = new int[columns][rows];

        for (int row = 0; row < rows; row++){
            for (int column = 0; column < columns; column++) {
                resultMatrix[column][row] = someMatrix[row][column];
            }
        }
        return resultMatrix;
    }
    public static void printMatrix(int[][] someMatrix){
        for (int[] matrix : someMatrix) {
            System.out.println();
            for (int i : matrix) {
                System.out.print(i + " ");
            }

        }
    }
}
