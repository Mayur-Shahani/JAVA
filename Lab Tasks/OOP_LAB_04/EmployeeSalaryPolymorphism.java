package LAB_04_TASK;
class Employee{
    void calculateSalary()
    {
        int baseSalary = 3000;
        System.out.println(baseSalary);
    }
}

class Manager extends Employee{
    @Override
    void calculateSalary()
    {
        int baseSalary = 5000;
        System.out.println("Manager Salary with 50% Bonus : " + (baseSalary + baseSalary*0.50));
    }
}

class Developer extends Employee{
    @Override
    void calculateSalary()
    {
        int baseSalary = 4000;
        System.out.println("Developer Salary with 30% Bonus : " + (baseSalary + baseSalary*0.30));
    }
}
public class EmployeeSalaryPolymorphism {
    public static void main(String[] args) {
        Developer d = new Developer();
         d.calculateSalary();

        Manager m = new Manager();
        m.calculateSalary();

        Employee e1 = new Employee();
        e1.calculateSalary();
    }
}
