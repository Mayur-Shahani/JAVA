package OOP_LAB;

import java.util.Scanner;
public class AbsoluteDifferenceCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number ");
        int num2 = sc.nextInt();

        int differ = Math.abs(num1 - num2);
        System.out.println("The absolute difference is : " + differ);
    }
}
