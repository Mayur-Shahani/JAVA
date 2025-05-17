class Employee{
    double calculateBonus(double salary)
    {
        double bonus = salary * 0.05; 
        return bonus;
   }

}
public class Employee_Bonus_Calculation {
    public static void main(String[] args) {
        Employee e = new Employee();
    System.out.println(e.calculateBonus(15000));    }
}
