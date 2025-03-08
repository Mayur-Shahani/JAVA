import java.util.Scanner;
public class Calculate_Result {
    public static void main(String[] args){
       System.out.println("Calculate Your Result ");
       float totalMarks = 400;

       System.out.print("Enter Your Marks : ");
        Scanner m = new Scanner(System.in);

       float subt1 = m.nextFloat();
       float subt2 = m.nextFloat();
       float subt3 = m.nextFloat();
       float subt4 = m.nextFloat();

       float obtainedMarks = sub1 + sub2 + sub3 + sub4;
       System.out.print("Your Obtained Marks is : ");
       System.out.println(obtainedMarks);

       float percentage = (obtainedMarks/totalMarks) * 100;
       System.out.print("Your percentage is : ");
       System.out.println(percentage);

    }
}
