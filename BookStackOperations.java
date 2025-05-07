
import java.util.Stack;
public class jav {
    public static void main(String[] args) {
       
        Stack <String> books = new Stack <String> ();
        books.push("History");
        books.push("Biology");
        books.push("Chemistry");
        books.pop();
       
        System.out.println("Stack before pop: " + books);
        String removedBook = books.pop();
        System.out.println("Removed book: " + removedBook);
        System.out.println("Stack after pop: " + books);
        
    }
}
