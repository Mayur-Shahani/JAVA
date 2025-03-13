public class Student {
    String name = "Mayur Shahani";
    double marks;
    String checkPass(double marks){
        if(marks >= 50)
        {
           return "Passed";
        }
        else
        {
           return "Failed";
        }

    }
}
