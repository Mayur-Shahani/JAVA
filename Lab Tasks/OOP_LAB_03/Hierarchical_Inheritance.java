class Parent{
    String name = "Mayur Shahani";
    public void Paren()
    {
        System.out.println(name);
    }
}

class Child extends Parent{
    int age= 20; 
    public void Chil()
    {
        System.out.println(age);
    }
}

class GrandChild extends Parent{
    String subject = "Object Oriented Programming";
    public void gr_Ch()
    {
        System.out.println(subject);
    }
}

public class Hierarchical_Inheritance{
    public static void main(String[] args) {

        GrandChild g = new GrandChild();
        g.Paren();
        g.gr_Ch();
                
    }
}