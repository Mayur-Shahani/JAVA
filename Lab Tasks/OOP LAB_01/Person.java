package OOP_LAB_1_TASK;
class Details{   
   void displayinfo(String name, int age ){
  System.out.println("Name is : " +name);
  System.out.println("Age is : " +age);
}

public class Person{
    public static void main(String[] args) {
        Details d = new Details();
        d.displayinfo("Mayur Shahani", 20);
    }
}
}
