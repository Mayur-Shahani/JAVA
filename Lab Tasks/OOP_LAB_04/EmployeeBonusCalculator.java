package LAB_04_TASK;
class Employee{
    double calculateBonus(int salary)
    {
        return salary*0.05;
    }

    double calculateBonus(int salary, int choice)
    {
        switch(choice)
        {
            case 1:
                 return salary*0;
            case 2:
                return salary*0.05;
            case 3:
                return salary*0.1;
            case 4:
                return salary*0.15;
            case 5:
                return salary*0.2;
            default:
                return 0.00;

        }
    }
}

public class EmployeeBonusCalculator{
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.calculateBonus(5000));
        System.out.println(e.calculateBonus(1000,2));
    }
}
