package ClassProgram;
import java.util.Scanner;
public class Switch_Case_Statement {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        age = sc.nextInt();

        switch(age)
        {
            case 10:
            System.out.println("Your Age is " +age);
            break;
        
            case 15:
            System.out.println("Your Age is "+age);
            break;

            case 20:
            System.out.println("Your Age is "+age);
            break;

            case 23:
            System.out.println("Your Age is "+age);
            break;

            default:
            System.out.println("Invalid Age");
        }



        
    }
}
