abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract double getBalance();
}

class SavingsAccount extends BankAccount {
    double balance = 0;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }
}

class CurrentAccount extends BankAccount {
    double balance = 0;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }
}

public class BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount s = new SavingsAccount();
        s.deposit(35000);
        s.withdraw(1900);
        System.out.println(s.getBalance());

        BankAccount c = new CurrentAccount();
        c.deposit(25000);
        c.withdraw(3500);
        System.out.println(c.getBalance());
    }
}
