import java.util.Scanner;
public class Even_Or_Odd{
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        x = sc.nextInt();

        if(x % 2 == 0)
        {
            System.out.println(x + "is Even");
        }
        else
        {
            System.out.println(x + " is Odd ");
        }
    }

}