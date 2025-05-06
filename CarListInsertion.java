package ARRAYLIST;
import java.util.ArrayList;

class CarListInsertion{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Suzuki");
        cars.add("Corolla");
        cars.add(1,"Honda");

        for(String car : cars)
        {
            System.out.println(car);
        }
    }
}