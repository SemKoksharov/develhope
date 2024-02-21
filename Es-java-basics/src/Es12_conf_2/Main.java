package Es12_conf_2;
public class Main {
    public static void main(String[] args) {
        char char1 = 'a';
        char char2 = 'n';

        System.out.println("Carattere 1: " + char1);
        System.out.println("Carattere 2: " + char2);
        System.out.println("Caratteri sono diversi? " + sonoDiversi(char1, char2));
    }

    public static boolean sonoDiversi(char char1, char char2) {
        return char1 != char2;
    }
}