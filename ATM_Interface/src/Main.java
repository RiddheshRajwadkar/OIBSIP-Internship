import java.util.Scanner;

import java.util.ArrayList;


public class Main {

    private static void initializeAccounts(){
        accounts.add(new Account("Riddhesh", "1234", 1000.0));
        accounts.add(new Account("Rohan", "5678", 1500.0));
    }

    private static ArrayList<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {

        initializeAccounts();

        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();

        while (true) {
            System.out.print("Enter user id: ");
            String userId = scanner.next();
            System.out.print("Enter user pin: ");
            String userPin = scanner.next();

            atm.login(userId, userPin, Main.accounts);
            if (atm.getCurrentUser() != null) {
                while (true) {
                    atm.displayMenu();
                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();
                    atm.performTransaction(choice, scanner);
                }
            }
        }
    }
}