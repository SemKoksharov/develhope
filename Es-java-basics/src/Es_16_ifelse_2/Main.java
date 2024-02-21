package Es_16_ifelse_2;

public class Main {
    public static void main(String args[]){
        String myText = "Sono un cane: <PAW! PAW!>\n:D :D :D ";

        System.out.println("La mia bella stringa: " + myText);
        System.out.println(lungDiString(myText));
    }
    public static String lungDiString(String myText){
        String result = "";
        if (myText.length() < 10){
            result = "Lunghezza meno di 10 simboli";
        } else if (myText.length() > 10) {
            result = "Lunghezza piu di 10 simboli";
        } else if (myText.length() == 10) {
            result = "Lunghezza = 10 simboli";
        }
        return result;
    }
}

