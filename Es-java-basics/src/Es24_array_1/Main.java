package Es24_array_1;

public class Main {
    public static void main(String args[]){
       int arrayNum[] = createArray();
        System.out.println(calcSumOfArrayNumb(arrayNum));

    }
    public static int[] createArray(){
        int arrayNum[] = new int[10];

        for(int i = 0; i < arrayNum.length; i++){
            arrayNum[i] = i + 1;
        }
        return arrayNum;
    }
    public static int calcSumOfArrayNumb(int arrayNum[]){
        int result = 0;
        for (int j = 0; j < arrayNum.length; j++){
            result += arrayNum[j];
                    
        }
        return result;
    }
}







