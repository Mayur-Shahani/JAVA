class Parent{
    void animal()
    {
        System.out.println("DOG");
    }
}
class Child extends Parent{
    @Override
    void animal()
    {
        System.out.println("CAT");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        
         Child ch = new Child();
        ch.animal();
        Parent p = new Parent();
        p.animal();
    }

}
