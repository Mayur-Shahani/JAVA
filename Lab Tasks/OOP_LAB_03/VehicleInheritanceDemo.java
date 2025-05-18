class Vehicle{

    public void start_Engine()
    {
        System.out.println("The vehicle engine starts.");
    }

}

class Car extends Vehicle{
    public void honk()
    {
        System.out.println( "The car honks");
    }
}


public class VehicleInheritanceDemo{
    public static void main(String[] args) {

       Car cr = new Car();
       cr.start_Engine();
       cr.honk();
    }
    
}

