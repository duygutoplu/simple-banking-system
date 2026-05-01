public class Main {
    public static void main(String[] args) {

        Account acc = new Account("Duygu", 1000);

        acc.printAccount();

        System.out.println("----- Deposit 500 -----");
        acc.deposit(500);
        acc.printAccount();

        System.out.println("----- Withdraw 300 -----");
        acc.withdraw(300);
        acc.printAccount();

        System.out.println("----- Withdraw 2000 -----");
        acc.withdraw(2000);
        acc.printAccount();
    }
}