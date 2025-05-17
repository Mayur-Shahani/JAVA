import java.util.*;

class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }
}

public class EmployeeSalaryAnalyzer {
    public static void main(String[] args) {
        ArrayList<Employee> member = new ArrayList<>();
        member.add(new Employee("Mayur", 45000));
        member.add(new Employee("Bilal", 50000));
        member.add(new Employee("Usaid", 55000));

        double max = member.get(0).getSalary();
        double min = member.get(0).getSalary();

        for (int i = 1; i < member.size(); i++) {
            if (max < member.get(i).getSalary()) {
                max = member.get(i).getSalary();
            }
            if (min > member.get(i).getSalary()) {
                min = member.get(i).getSalary();
            }
        }

        System.out.println("The Maximum Salary is: " + max);
        System.out.println("The Minimum Salary is: " + min);
    }
}
