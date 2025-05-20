import java.util.*;

class LinkedListNames{
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();

        l.addFirst("Mayur Shahani");
        l.add("M.Aarf");
        l.add("Rafay");
        l.add("Daniyal");
        l.addLast("Nasir");

        for(String s : l)
        {
            System.out.println(s);
    }
    }
}