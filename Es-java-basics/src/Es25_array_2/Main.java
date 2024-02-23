package Es25_array_2;

public class Main {
    public static void main(String args[]){
      char arrayChar[] = createCharArray();
      char findChar = 'a';
        System.out.println("Array creato:");
        System.out.println(createCharArray());
        System.out.println("Nel nostro array, il carattere a appare " + findMyChar(findChar, createCharArray()) + " volte." );
    }
    public static char[] createCharArray(){
        char arrayChar[] = new char[200];
        for (int charInd = 0; charInd < arrayChar.length; charInd++){
            arrayChar[charInd] = (char) (charInd + 1);
        }
        return arrayChar;
    }
    public static int findMyChar(char findChar, char[] createCharArray){
        int result = 0;
        for (int i = 0; i < createCharArray.length; i++){
            if (createCharArray[i] == findChar){
                result++;
            }
        }
        return result;
    }
}

