package Encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountNumber("259744719");
        account.setBalance(5000.0);

        System.out.println("Account details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}
