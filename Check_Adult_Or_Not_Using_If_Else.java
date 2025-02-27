import java.util.*;
public class Check_Adult_Or_Not_Using_If_Else {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("Not an Adult");
        }
    }
}