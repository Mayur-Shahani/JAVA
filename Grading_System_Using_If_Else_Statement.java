package ClassProgram;
import java.util.Scanner;
public class Grading_System_Using_If_Else_Statement {
    public static void main(String[] args) {
        double percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Percentage : ");
        percentage = sc.nextDouble();

        if(percentage < 100 && percentage >= 90)
        {
            System.out.println("Grade A+");
        }
        else if(percentage < 90 && percentage >= 80)
        {
            System.out.println("Grade A");
        }
        else if(percentage < 80 && percentage >= 70 )
        {
            System.out.println("Grade B");
        }
        else if(percentage < 70 && percentage >= 60)
        {
            System.out.println("Grade C");
        }
        else if(percentage < 60 && percentage >= 50)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}
