class Add{
    static int num = 67;
    int num2 = 45;

    static int sum()
    {
        num = num + 33;
        return num;

    }

    int sub()
    {
        int s = num - num2;
        return s;
    }
}
public class S {
    public static void main(String[] args) {
     int res1 = Add.sum();
     System.out.println(res1);

     Add a = new Add();
     int res2 = a.sub();
     System.out.println(res2);
    }
}
