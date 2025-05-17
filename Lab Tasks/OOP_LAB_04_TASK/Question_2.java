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
        System.out.println(baseSalary + baseSalary*50);
    }
}

class Developer extends Employee{
    @Override
    void calculateSalary()
    {
        int baseSalary = 4000;
        System.out.println(baseSalary + baseSalary*30);
    }
}
public class Question_2 {
    public static void main(String[] args) {
        Developer d = new Developer();
         d.calculateSalary();

        Manager m = new Manager();
        m.calculateSalary();

        Employee e1 = new Employee();
        e1.calculateSalary();
    }
}
