public class Book {
    private String title;
    private String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public void printBookInfo() {
        System.out.print(title + ", written by " + author);
    }
}

// Part A
public class PictureBook extends Book {
    private String illustrator;

    public PictureBook(String t, String a, String i) {
        super(t,a);
        illustrator = i;
    }

    public void printBookInfo() {
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }
}

// Part B
ArrayList<Book> myLibrary = new ArrayList<Book>();
Book book1 = new Book("Frankenstein","Mary Shelley");
Book book2 = new PictureBook("The Wonderful Wizard of Oz","L. Frank Baum","W.W. Denslow");
myLibrary.add(book1);
myLibrary.add(book2);

// Part C
public class BookListing {
    private Book book;
    private double cost;

    public BookListing(Book b, double c) {
        book = b;
        cost = c;
    }

    public void printDescription() {
        book.printBookInfo();
        System.out.print(", $" + cost);
    }
}
