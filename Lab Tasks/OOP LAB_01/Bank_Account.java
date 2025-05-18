 class BankAcc {
  int accountNumber;
  double balance = 45000;
 
    void deposit(int amount){
      balance = balance + amount;
  }

  void balance(){
      System.out.println(balance);
  }
 }

 class Bank_Account{
    public static void main(String[] args) {
        BankAcc d = new BankAcc();
        d.deposit(5000);
        d.balance();
    }
 }