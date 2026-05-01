public class Account {

    String owner;
    double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

   
    public void printAccount() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }
}