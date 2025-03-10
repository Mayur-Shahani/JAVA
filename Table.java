import java.util.*;
public class Table {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number : ");
        x = sc.nextInt();
        for(int i = 1; i <=10; i++ )
        {
            System.out.println(x + " * " + i + " = " + x*i);
        }
    }
}
