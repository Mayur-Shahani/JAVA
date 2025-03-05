import java.util.*;

class Temp {
    private float temp;

    void celsius(float value) {
        temp = value;  // Store Celsius directly
    }

    void setfaren(float value) {
        temp = (value - 32) * (5.0f / 9);  // Convert Fahrenheit to Celsius before storing
    }

    void Tofaren() {  // Convert stored Celsius to Fahrenheit
        float faren1 = (temp * (9.0f / 5.0f)) + 32;
        System.out.println("Converted to Fahrenheit: " + faren1 + "°F");
    }

    void toCel() {  // Convert stored Fahrenheit (in Celsius form) to Celsius
        System.out.println("Stored Temperature in Celsius: " + temp + "°C");
    }

    void show() {  // Show stored temperature
        System.out.println("Stored temperature: " + temp + "°C");
    }
}

public class Tempreture_Converter{
    public static void main(String[] args) {
        Temp tem = new Temp();
        Scanner scan = new Scanner(System.in);

        while (true) {  // Loop to allow multiple choices
            System.out.println("\n1. Store in Celsius");
            System.out.println("2. Store in Fahrenheit");
            System.out.println("3. Convert to Fahrenheit");
            System.out.println("4. Show Temperature in Celsius");
            System.out.println("5. Show Stored Temperature");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Celsius value: ");
                    tem.celsius(scan.nextFloat());
                    break;
                case 2:
                    System.out.print("Enter Fahrenheit value: ");
                    tem.setfaren(scan.nextFloat());
                    break;
                case 3:
                    tem.Tofaren();
                    break;
                case 4:
                    tem.toCel();
                    break;
                case 5:
                    tem.show();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
