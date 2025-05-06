package ARRAYLIST;
import java.util.ArrayList;

public class CarListRemoval {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Suzuki");
        cars.add("Corolla");
        cars.add("Honda");
        cars.remove( 1);

        for(String car : cars)
        {
            System.out.println(car);
        }
    }
    
}

