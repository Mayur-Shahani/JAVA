package OOP_LAB_08;
import java.util.*;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(45);
        list.add(67);
        list.add(99);
        list.add(34);
       
        System.out.println("Original List ");
        for(int print : list)
        {
            System.out.println(print);
        }

        System.out.println("Reversed List ");
        for(int i = 4; i >=0; i--)
        {
            System.out.println(list.get(i));
        }
    }
}
