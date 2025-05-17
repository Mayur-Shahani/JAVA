    class Bank_Account {
    String accountNumber;
    double balance = 60000.0;

    // Deposit method to add money to the balance
    double deposit(int amount) {
        balance = balance + amount;
        return balance;  // Return updated balance
    }

    // Getter method to show the current balance
    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Bank a4 = new Bank(); // Create a new Bank object
        System.out.println("Balance after deposit: " + a4.deposit(100)); // Deposit 100 and print the balance
        a4.showBalance(); // Display current balance using showBalance method
    }
}
