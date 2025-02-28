package ClassProgram;
import java.util.Scanner;
public class String_Input_And_Print {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    String fullName = sc.nextLine();
         
    System.out.println("Your Name is "+fullName);

    System.out.printf("Your Name is %s ",fullName);
   
    }
}
