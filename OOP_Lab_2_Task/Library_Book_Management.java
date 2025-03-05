package OOP_Lab_2_Task;

class Book{
    private String title;
    private String author;
    private boolean isIssued = false;

    Book(String title1, String author){
        title = title1;
        author = author;
    }

    void issueBook(){
        isIssued = true;
        System.out.println("Is Issued");
    }

    void returnBook(){
        isIssued = false;
        System.out.println("Is Returned");
    }

    void showStatus(){
        if(isIssued)
        {
            System.out.println("The book is issued");
        }
        else
        {
            System.out.println("The book is returned and available");
        }

    }



}
public class Library_Book_Management {
    public static void main(String[] args) {
        Book b = new Book("helo","araf");
        b.issueBook();
        b.returnBook();
        b.showStatus();
    }
    
   
}
