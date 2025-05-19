 class Circle {
    public static double calculateArea(final double radius) {
        System.out.println(radius);
        radius = 23.789;  //Error: cannot assign a value to final variable 'radius'
        return radius;
    }
}

    public class FinalParameterExample{
    public static void main(String[] args) {
        System.out.println("Area: " + calculateArea(5.0));
    }
}
