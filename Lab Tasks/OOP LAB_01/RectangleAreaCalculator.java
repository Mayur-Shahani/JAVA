
 class Rectangle {
  double length;
  double width;

  Rectangle(double length, double width)
  {
    this.length = length;
    this.width = width;
  }
  double area(){
      return length * width;
}
}
 public class RectangleAreaCalculator{
  public static void main(String[] args) {
    Rectangle r = new Rectangle(34, 2);
    System.out.println(r.area());
  }
 }
