import java.util.*;
public class Calculate_Factorial {

    public static void calculateFactorial(int x)
    {
        if(x < 0)
        {
            System.out.println("Please Enter Number Greater Than 0");
            return;
        }

        int fact = 1;
        for(int i = x; i >= 1; i--)
        {
            fact = fact * i;

        }
        System.out.println("The Factorial of " + x + " is : " + fact);
        return;


    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find Factorial : ");
        num = sc.nextInt();

        calculateFactorial(num);
    }
}
