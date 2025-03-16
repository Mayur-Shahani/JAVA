import java.util.Scanner;
public class Practice_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age : " );
        int  age =  sc.nextInt();
        if(age >= 18)
        {
          System.out.println("Your Age Is  : "  + age);
        }

        else{
            System.out.println("Your are Under Age");
        }
    }
}
