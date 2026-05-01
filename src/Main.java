import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // kullanıcıdan isim al
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Account account = new Account(name, 1000);

        while (true) {
            System.out.println("\n--- Simple Banking System ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Account");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                account.deposit(amount);
                System.out.println("Money deposited successfully.");

            } else if (choice == 2) {
                System.out.print("Enter withdraw amount: ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);

            } else if (choice == 3) {
                account.printAccount();

            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid option!");
            }
        }

        scanner.close();
    }
}