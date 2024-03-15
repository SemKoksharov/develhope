public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca("Hitler's library", "via Germania",new Libro[0]);
        Biblioteca biblioteca = new Biblioteca("Lenina", "via Lenina");
       Libro libro = new Libro("Totol", "Autor", 222);
        Libro libro1 = new Libro("Gulag My Love", "Stalin", 88);

        biblioteca.addLibro(libro);
        biblioteca.stampaLibri();
        System.out.println("Libri trovati:\n"+biblioteca.cercaLibro("totol"));
        biblioteca.removeLibro(libro);
        biblioteca.stampaLibri();
        biblioteca.addLibro(libro);
        biblioteca.addLibro(libro1);
        biblioteca.stampaLibri();
        System.out.println(libro);
    }
}