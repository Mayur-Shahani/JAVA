class Math_Operation{
     static int add( int a,  int b)
    {
         return  a + b;
    }


    static int max(int a, int b, int c)
    {
        if(a > b && a > c)
        {
            return a;
        }
       else if(b > a && b > c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
}



public class Q1 {
    public static void main(String[] args) {
     Q1.greet();

        int res1 =  Q1.sq(4);
        System.out.println(res1);

       int res2 =  Math_Operation.add(5,5);
       System.out.println(res2);

      int res3 =  Math_Operation.max(5,10,15);
      System.out.println(res3);
    }

    static void greet()
    {
        System.out.println("Hello Java!");
    }

    static int sq(int n)
    {
        return n * n;
    }

    
}
