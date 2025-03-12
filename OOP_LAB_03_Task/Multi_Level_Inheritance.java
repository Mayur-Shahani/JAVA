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

class GrandChild extends Child{
    String subject = "Object Oriented Programming";
    public void gr_Ch()
    {
        System.out.println(subject);
    }
}


public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        gc.Paren();
        gc.Chil();
        gc.gr_Ch();
    }
}
