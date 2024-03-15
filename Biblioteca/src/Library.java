import java.util.ArrayList;

public class Library {
    private String name;
    private String address;
    private ArrayList<Book> books;

    public Library(String name, String address, ArrayList<Book> books) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<Book>();
    }

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void printAllBooks(ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }

    public ArrayList<Book> findBook(String infoForSearch) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(infoForSearch.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(infoForSearch.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    public void addBook(Book book) {
        books.add(book);
    }


}
