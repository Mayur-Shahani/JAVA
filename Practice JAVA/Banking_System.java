class Bank{
    static int balance = 1000;
   
    static void Deposit(int a)
    {
      
        balance += a;
        System.out.println("The Balance After Deposit is : " +balance);
        return;
    }

    static void Withdraw(int b)
    {
        balance -= b;
        System.out.println("The Balance after withdraw is : " + balance);
        return;
    }


    }

public class New {
    public static void main(String[] args) {
        Bank.Deposit(500);
        Bank.Withdraw(500);
    }
    
}
