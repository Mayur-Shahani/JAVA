package Camera.java;
interface Operation{
    default void add(int a, int b)
    {
        int res = a + b;
        System.out.println(res);
    }
}

interface Operation2{
    default void subtract(int a, int b)
    {
        int res = a - b;
        System.out.println(res);
    }
}

class Result implements Operation,Operation2
{

}
public class Operations_Using_Interface {
    public static void main(String[] args) {
        Result r = new Result();
        r.add(34, 26);
        r.subtract(34,24);
        
    }
    
}
