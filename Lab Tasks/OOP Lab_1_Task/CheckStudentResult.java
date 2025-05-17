class Student {
  String name;
  double marks;
    Student(String name, double marks)
    {
        this.name = name;
        this.marks = marks;
    }
    void checkPass(){
      if(marks >= 50)
      {
         System.out.println("Passed");
      }
      else
      {
         System.out.println("Failed");
      }

  }
}

public class CheckStudentResult{
  public static void main(String[] args) {
    Student s = new Student("Mayur Shahani", 78);
    s.checkPass();
  }
}