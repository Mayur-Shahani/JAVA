package Array;
interface Shape
{
    default void calculator()
    {
        System.out.println("Shape");
    }
}

interface Shape2
{
    default void advancedCalculator()
    {
        System.out.println("Algebra");
    }
}
class Circle implements Shape,Shape2
{
    void area1()
    {
        double pi = 3.14;
        double r = 5;

        double ar = (r*(pi * pi));
        System.out.println("The area of Circle is : " + ar);
    }
}

class Rectangle implements Shape, Shape2
{
    void area2()
    {
        double length = 5.45;
        double width = 7.23;
        double ar = width * length;
        System.out.println("The Area Of Rectangle is : " + ar);
    }
}
public class Shape_Area_Calculator_Using_Interface {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.advancedCalculator();
        r.area2();
        r.calculator();

        Circle c = new Circle();
        c.advancedCalculator();
        c.area1();
        c.calculator();
    }
    
}
