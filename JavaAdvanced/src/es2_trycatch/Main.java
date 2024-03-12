package es2_trycatch;

public class Main {
    public static void main(String[] args) {
        isNumber('5');
    }

    public static void isNumber(char sym) {
        if (sym <= '9' && sym >= '0') {
            System.out.println("'" + sym + "'"+ " `e numero.");
        } else {
            throw new IllegalArgumentException("Character " + "'" + sym + "'" + " non `e numero");
        }
    }
}