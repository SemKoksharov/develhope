public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private String description;
    private double price;

    public Book(String title, String author, int yearOfPublication, String description, double price) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.description = description;
        this.price = price;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " Title: " + title +
                " Author: " + author +
                " YearOfPublication: " + yearOfPublication +
                " Description: " + description +
                " Price=" + price;

    }

    public void shortBookInfo() {
        System.out.println("### Short book info: \n" + "Title and author:" + title + " " + author + "\nPrice: " + price);
    }

    public static void compareYearOfPublication(Book book1, Book book2) {
        if (book1.getYearOfPublication() < book2.getYearOfPublication()) {
            System.out.println("Older book is " + book1.getTitle() + " " + book1.getAuthor());

        } else {
            System.out.println("Older book is " + book2.getTitle() + " " + book2.getAuthor());
        }
    }
}
