

class book{

    private String title;
    private String author;
    private boolean isIssued = false;

    book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    void issueBook()
    {
        isIssued = true;
        System.out.println("Is Issued");
    }

    void returnBook()
    {
        isIssued = false;
        System.out.println("is Available");
    }

    void showStatus()
    {
        if(isIssued)
        {
            System.out.println("The book is issued");
        }
        else
        {
            System.out.println("The book is available");
        }
    }
}


public class Library_Book_Management{
    public static void main(String[] args) {
        book bk = new book("Harry Potter","Araf");
        bk.issueBook();
        bk.returnBook();
        bk.showStatus();
    }
}