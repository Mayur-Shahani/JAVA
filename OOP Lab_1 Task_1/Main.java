

public class Main {
    public static void main(String[] args){
      Person a1 = new Person();
      a1.displayinfo();


      Rectangle a2 = new Rectangle();
      System.out.println("Area of Rectangle is " +a2.area());


      Calculator a3 = new Calculator();
      System.out.println("The addition is : " +a3.add());
      System.out.println("The Multiplication is : " +a3.multiply());

      BankAccount a4 = new BankAccount();
      System.out.println(a4.deposit(100));

      Student a5 = new Student();
      System.out.println(a5.checkPass(76));
    }
}