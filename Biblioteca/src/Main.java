import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("My book", "Sem Koks", 1992,
                "Book of my live", 666);
        Book book1 = new Book("SuperBook", "Cane di Pavlov", 2000,
                "Super dope shit book", 15);

        Library library = new Library("Bib", "via cazzo", new ArrayList<Book>());

        library.addBook(book);
        library.addBook(book1);

        library.printAllBooks(library.getBooks());
        Book.compareYearOfPublication(book,book1);
        System.out.println(library.findBook("pav"));

        book.shortBookInfo();
    }
}