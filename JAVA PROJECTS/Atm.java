import java.util.*;

public class Atm {
    static float balance = 1000;
    final int pin = 1234;

    public static void checkBalance() {
        System.out.println("Balnce in your account is: " + balance);
        menu();
    }

    public static void withdrawMoney() {
        System.out.println("Enter the amount to be withdraw");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if (amount < balance) {
            balance -= amount;
            System.out.println("Balance after withdrwa :" + balance);
        } else {
            System.out.println("Eneter amount less tahn balance");
            withdrawMoney();
        }
        menu();
    }

    public static void depositMoney() {
        System.out.println("Enter the amount to be deposit");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("Balnce after Deposit Money: " + balance);
        menu();
    }

    public static int exit() {
        System.out.println("Exit");
        return 0;
    }

    public static void menu() {
        System.out.println("enter your choice: ");
        System.out.println("1. Check A/C Balance.");
        System.out.println("2. Withdraw Money.");
        System.out.println("3. Deposit Money.");
        System.out.println("4. Exit.");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1)
            checkBalance();
        else if (option == 2)
            withdrawMoney();
        else if (option == 3)
            depositMoney();
        else
            exit();
    }

    public void checkPin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid pin to start: ");
        int enteredPin = sc.nextInt();
        if (enteredPin == pin)
            menu();
        else
            System.out.println("Entered a valid pin");
    }

    public static void main(String[] args) {
        Atm obj = new Atm();
        obj.checkPin();
    }
}
