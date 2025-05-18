class calcul{
    public  void add(int a, int b)
    {
        int res = 0;
        res = a + b;
        System.out.println(res);
    }

    public void add(int a, int b, int c)
    {
        int res = 0;
        res = a + b + c;
        System.out.println(res);
    }
}
public class UseOfPolymorphism {
    public static void main(String[] args) {
        calcul c1 = new calcul();
        c1.add(45, 55);
        c1.add(45,55,50);
        
    }

}
