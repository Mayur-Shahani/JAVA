package Array;

 interface Math{
    default void add(){
        System.out.println("Sum");
    }
} 
 interface Calculus{
    default void cal()
    {
        System.out.println("Cals");
    }
}

class Result implements Calculus,Math{

}
class Multiple_Inheritance_Using_Interface{
    public static void main(String[] args)
    {
        Result r = new Result();
        r.add();
        r.cal();   
    }
}