import java.util.*;

abstract class Shape{
    abstract void getArea();
    
}

class Circle extends Shape{
    @Override
   void getArea()
    {
        float radius = 7;
        double pi = 3.14;
       System.out.println((pi * radius) * radius);
    }

}

class Rectangle extends Shape{
    @Override
   void getArea()
    {
        int length = 70;
        int width = 56;
       System.out.println(length * width);
    }

}
public class ShapeAreaCalculator {
    public static void main(String[] args) {
       Shape r = new Rectangle();
      r.getArea();

       Shape s = new Circle();
       s.getArea();



        
    }
}
