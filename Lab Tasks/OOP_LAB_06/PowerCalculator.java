package OOP_LAB;

class Power{
    int Square(int baseNum, int expNum){
        return (int)Math.pow(baseNum, expNum);
    }
}
public class PowerCalculator{
    public static void main(String[] args){
        Power p = new Power();
        System.out.println(p.Square(3,3));

    }
}