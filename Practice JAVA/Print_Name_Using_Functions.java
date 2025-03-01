import java.util.*;
public class Print_Name_Using_Functions {

    public static void printName(String name)
    {
        System.out.println("Your Name Is "+name);
        return;

    }
    public static void main(String[] args) {
       String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        name = sc.nextLine();
        printName(name);


        
    }
}
