package OOP_LAB_08;
import java.util.*;
public class BookStackDemo {
    public static void main(String[] args) {
        Stack<String> book = new Stack<>();
        book.push("OOP");
        book.push("DS");
        book.push("Math");
        book.push("PF");
        book.push("DLD");
       
        System.out.println("Removed Books ");
        System.out.println(book.pop()); ;
        System.out.println(book.pop());

        System.out.println("Remaining Books ");
        for(String b : book)
        {
            System.out.println(b);
        }
    }
}
