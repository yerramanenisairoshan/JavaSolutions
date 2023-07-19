package Inheritance;

public class BankAccount {
    public double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
        } else {
            System.out.println("Cannot withdraw, balance will fall below 100");
        }
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(50);
        savingsAccount.withdraw(150);
    }
}

