import java.util.Scanner;
public class Check_Number_Is_Positive_Negative_Or_Zero {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        x = sc.nextInt();

        if(x > 0)
        {
            System.out.println(x + "is Positive");
        }
        else if(x < 0)
        {
            System.out.println(x + "is Negative");
        }
        else
        {
            System.out.println(x + "is Zero");
        }


    }
}
