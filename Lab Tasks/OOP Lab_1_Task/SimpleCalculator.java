class Calculator {
 
  int add(int a, int b){
      int add = a + b;
      return add;
  }
  
  int multiply(int a , int b){
      int multiply = a * b;
      return multiply;
  }
}

public class Calcul{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(45, 67));
        System.out.println(c.multiply(3,5));
    }
}