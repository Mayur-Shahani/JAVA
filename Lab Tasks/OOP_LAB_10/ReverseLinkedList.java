import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.addFirst("Mayur");
        list.add("Sir Farzeen");
        list.add("Sir Aliyan");
        list.add("Sir Umer");
        list.addLast("Sir Sheeraz");

        System.out.println("**** Original List ****");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println( list.get(i) );
        }
         Collections.reverse(list);
        System.out.println("**** Reversed List ****");
         for(String s : list)
        {
            System.out.println( s );
        }
    }
}
