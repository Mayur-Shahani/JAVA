import java.util.Scanner;
public class CalculateResult {
    public static void main(String[] args){
       System.out.println("Calculate Your Result ");
       float totalMarks = 400;

       System.out.print("Enter Your Marks : ");
        Scanner m = new Scanner(System.in);

       float sub1 = m.nextFloat();
       float sub2 = m.nextFloat();
       float sub3 = m.nextFloat();
       float sub4 = m.nextFloat();

       float obtainedMarks = sub1 + sub2 + sub3 + sub4;
       System.out.print("Your Obtained Marks is : ");
       System.out.println(obtainedMarks);

       float percentage = (obtainedMarks/totalMarks) * 100;
       System.out.print("Your percentage is : ");
       System.out.println(percentage);

    }
}
