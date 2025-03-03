import java.util.Scanner;
public class UserInput {
   
    public static void main(String[] args){
        System.out.println("Enter Your Age :  ");
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();
        System.out.println("Your Age is : ");
        System.out.println(age);
    }
}
