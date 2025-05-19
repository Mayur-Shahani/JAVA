interface Printable {
    void print();
}

class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void print() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Magazine implements Printable {
    private String title;
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        this.title = title;
        this.issueNumber = issueNumber;
    }

    public void print() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class PrintableInterfaceTest {
    public static void main(String[] args) {
        Printable book = new Book("Harry Poter", "Araf");
        Printable magazine = new Magazine("Arafs", 409);

        book.print();
        magazine.print();
    }
}
