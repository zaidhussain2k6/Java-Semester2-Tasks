import java.util.Scanner;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String holder, String number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposited: " + amount);
        } else {
            System.out.println("❌ Invalid amount");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("💸 Withdrawn: " + amount);
        } else {
            System.out.println("❌ Insufficient balance or invalid amount");
        }
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("💰 Current Balance: " + balance);
    }
}

