package OOP_LAB_08;
import java.util.*;

class Employee{
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
}
public class HighestSalaryEmployee{
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<Employee>();

        arr.add(new Employee(1, "Mayur", 55000));
       arr.add(new Employee(2, "Araf", 45000));
       arr.add(new Employee(3, "Rafay", 40000));

      Employee highestSalary = arr.get(0);
       for(int i = 0; i < arr.size(); i++)
       {
        if(arr.get(i).salary > highestSalary.salary)
        {
            highestSalary = arr.get(i);
        }
       }

      System.out.println("Highest Salary Employee:");
System.out.println("ID: " + highestSalary.id);
System.out.println("Name: " + highestSalary.name);
System.out.println("Salary: " + highestSalary.salary);

    }
}