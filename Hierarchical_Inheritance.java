package Inheritance_Types;
class Shape{
    void draw()
    {
        System.out.println("Drawing Start.......");
    }
}

class Circle extends Shape{
    void area_Of_Circle()
    {
        System.out.println("The Formula of Area of circle is A=π * r * r" );
    }
}

class Rectangle extends Shape{
    void area_Of_Rectangle()
    {
        System.out.println("The formula of Area of Rectangle is Area = Length * Width");
    }
}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.draw();
        r1.area_Of_Rectangle();

        Circle c1 = new Circle();
        c1.draw();
        c1.area_Of_Circle();
    }
}
