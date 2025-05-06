import java.util.ArrayList;

public class ClearCarList{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Suzuki");
        cars.add("Corolla");
        cars.add("Honda");
        cars.clear();

        System.out.println(cars);
    }
    
}

