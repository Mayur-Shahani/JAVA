import java.util.*;

public class LinkedListDeletionDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Mayur");
        list.add("M.Araf");
        list.add("Rafay");
        list.add("Hamza");
        list.addLast("Nasir");

        System.out.println("Before Deleting ");
        for(String s : list)
        {
            System.out.println(s);
        }

        System.out.println("After Deleting First Node ");
        list.removeFirst();
        for(String s : list)
        {
            System.out.println(s);
        }

        System.out.println("After Deleting Last Node");
        list.removeLast();
        for(String s : list)
        {
            System.out.println(s);
        }

        System.out.println("Delete Node at any given Position ");
        list.remove(2);
        for(String s : list)
        {
            System.out.println(s);
        }
        
    }
}
