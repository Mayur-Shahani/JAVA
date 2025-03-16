class BankAccount{

    private int bal = 10000;

    void deposit(int dep)
    {
        bal = bal + dep;
        System.out.println("Your Updated Balance is : " + bal);

    }

    void withdraw(int amount)
    {

        if(amount > bal)
        {
            System.out.println("Your Amount is Greater than Balance");
        }
        bal = bal - amount;
        System.out.println("Your Balance after withdraw is : " + bal);
    }
}
public class Q3 {
    public static void main(String[] args) {
    BankAccount bk = new BankAccount();
    bk.deposit(5000);
    bk.withdraw(3000);
        
    }
}
