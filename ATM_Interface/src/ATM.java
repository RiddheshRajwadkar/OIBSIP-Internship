import java.util.ArrayList;
import java.util.Scanner;

class ATM {
    private Account currentUser;
    private ArrayList<Transaction> transactionHistory;
    public static ArrayList<Account> accounts = new ArrayList<>();

    public ATM() {
        this.transactionHistory = new ArrayList<>();
    }

    public void login(String userId, String userPin, ArrayList<Account> accounts) {
        for (Account account : accounts) {
            if (account.getUserId().equals(userId) && account.getUserPin().equals(userPin)) {
                currentUser = account;
                System.out.println("Login successful. Welcome, " + userId + "!");
                return;
            }
        }
        System.out.println("Invalid credentials. Login failed.");
    }

    public void displayMenu() {
        System.out.println("1. Transactions History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");
    }

    public void performTransaction(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                displayTransactionHistory();
                break;
            case 2:
                withdraw(scanner);
                break;
            case 3:
                deposit(scanner);
                break;
            case 4:
                transfer(scanner);
                break;
            case 5:
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void displayTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    private void withdraw(Scanner scanner) {
        System.out.print("Enter withdrawal amount: $");
        double amount = scanner.nextDouble();
        currentUser.withdraw(amount);
        transactionHistory.add(new Transaction(currentUser.getUserId(), "Withdrawal", amount));
        System.out.println("Withdrawal successful. Remaining balance: $" + currentUser.getBalance());
    }

    private void deposit(Scanner scanner) {
        System.out.print("Enter deposit amount: $");
        double amount = scanner.nextDouble();
        currentUser.deposit(amount);
        transactionHistory.add(new Transaction(currentUser.getUserId(), "Deposit", amount));
        System.out.println("Deposit successful. New balance: $" + currentUser.getBalance());
    }

    public Account getCurrentUser() {
    return currentUser;
}


    private void transfer(Scanner scanner) {
        System.out.print("Enter recipient's user id: ");
        String recipientId = scanner.next();
        System.out.print("Enter transfer amount: $");
        double amount = scanner.nextDouble();

        for (Account account : accounts) {
            if (account.getUserId().equals(recipientId)) {
                currentUser.transfer(account, amount);
                transactionHistory.add(new Transaction(currentUser.getUserId(), "Transfer", amount));
                return;
            }
        }

        System.out.println("Recipient not found. Transfer failed.");
    }
}