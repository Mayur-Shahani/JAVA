package Inheritance_Types;
class Vehicle{
    void start()
    {
        System.out.println("Start......");
    }
}

class Car extends Vehicle{
    void accelerate()
    {
        System.out.println("Accelerate........");
    }
}

class Sports_Car extends Car{
    void turbo_Boost()
    {
        System.out.println("Double Speed");
    }
}
public class Multiple_Inheritance {
    public static void main(String[] args) {
        Sports_Car sp = new Sports_Car();
        sp.start();
        sp.accelerate();
        sp.turbo_Boost();
    }
    
}
