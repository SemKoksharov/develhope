package Es27_ar2d;

public class Main {
  public static void main(String[] args){
      int newArr2D[][] = {
              {6, 10, 4},
              {1, 4, 88}
      };
      System.out.println(sumOfFirstStringOfMatrix(newArr2D));
  }
  public static int sumOfFirstStringOfMatrix(int someArr[][]){
      int result = 0;
      for (int value : someArr[0]){
          result += value;
          }
      return result;
      }
  }

