public class BankAccount {
    String accountNumber ;
    double balance = 60000.0;


    double  deposit(int amount){

        balance = balance + amount;
        return balance;

    }

    void balance(){
        System.out.println(balance);
    }
}
