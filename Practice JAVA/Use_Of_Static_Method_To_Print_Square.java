class Test{
   static void test(int x)
    {
        System.out.println("The Square of " + x + " is " + x * x);
    }
}

public class Use_Of_Static_Method_To_Print_Square {
    public static void main(String[] args) {
        Test.test(6);
    }
}
