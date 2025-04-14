package Array;
class PrintName{
    void empl()
    {
        String emplNames[] = {"Ali", "Ahmed", "Bilal"};
        for(int i = 0; i < emplNames.length; i++)
        {
            System.out.println("The " + (i+1) + " Name of Employee is : " + emplNames[i]);
        }
    }
}

class PrintNameUsingArray{
    public static void main(String[] args)
    {
        PrintName p = new PrintName();
        p.empl();
    }
}