package LAB_04_TASK;
class Employee{
    void printDetails(int id)
    {
        System.out.println("Employee ID : " + id);
    }
    
    void printDetails(String name)
    {
        System.out.println("Employee Name : " + name);
    }

    void printDetails(int id, String name)
    {
        System.out.println("Employee ID is : " + id + " and Employee Name is : " + name);
    }
}
public class EmployeeDetailsOverloading {
    public static void main(String[] args) {
        Employee e2 = new Employee();
        e2.printDetails(43);
        e2.printDetails("John Doe");
        e2.printDetails(55,"Mayur Shahani");
    }
}
