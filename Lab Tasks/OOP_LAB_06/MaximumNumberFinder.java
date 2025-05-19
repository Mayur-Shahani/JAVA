package OOP_LAB;
import java.util.Scanner;
public class MaximumNumberFinder {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter Third Number : ");
        int num3 = sc.nextInt();
        int max = Math.max(num1,num2);
       System.out.println("The Maximum of num1 and num2 is : " + max);

       int finalMax = Math.max(max, num3);
       System.out.println("The Maximum Number of all is : " + finalMax);
    }
}
