package Array;
interface Maths{
    default void add()
    {
        System.out.println("Sum");
    }
}

class Algebra{
    void alg()
    {
        System.out.println("Calculus");
    }
}

class MVC extends Algebra implements Maths {
    void bm2()
    {
        System.out.println("Basic Mathmatics 1 and 2");
    }
}

 class PInterface_and_Inheritance_Demo{
    public static void main(String[] args) {
        MVC m = new MVC();
        m.bm2();
        m.alg();
        m.add();
    }
 }