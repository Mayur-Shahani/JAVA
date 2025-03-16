public class Person{
  String name = "Mayur Shahani";
int age = 22;
void displayinfo(){
  System.out.println("Name is : " +name);
  System.out.println("Age is : " +age);
}
}

public class Rectangle {
  double length = 56;
  double width = 34;
  double area(){
      return length * width;
}
}

public class Calculator {
  int a = 56;
  int b = 6;

  int add(){
      int add = a + b;
      return add;
  }
  
  int multiply(){
      int multiply = a * b;
      return multiply;
  }

}

public class Bank_Account {
  String accountNumber ;
  double balance = 60000.0;


  double  deposit(int amount){

      balance = balance + amount;
      return balance;

  }

  void balance(){
      System.out.println(balance);
  }
}

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

public class Main {
    public static void main(String[] args){
      Person a1 = new Person();
      a1.displayinfo();

      Rectangle a2 = new Rectangle();
      System.out.println("Area of Rectangle is " +a2.area());

      Calculator a3 = new Calculator();
      System.out.println("The addition is : " +a3.add());
      System.out.println("The Multiplication is : " +a3.multiply());

      Bank_Account a4 = new Bank_Account();
      System.out.println(a4.deposit(100));

      Student a5 = new Student();
      System.out.println(a5.checkPass(76.66));
    }
}