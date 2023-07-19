package Interface;
import java.util.*;
public interface Account {
        void deposit(double amount);
        void withdraw(double amount);
        double calculateInterest();
        double getBalance();
    }

    class SavingsAccount implements Account {

        private double balance;
        private double interestRate;

        public SavingsAccount(double balance, double interestRate) {
            this.balance = balance;
            this.interestRate = interestRate;
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
        }

        @Override
        public void withdraw(double amount) {
            balance -= amount;
        }

        @Override
        public double calculateInterest() {
            return balance * interestRate;
        }

        @Override
        public double getBalance() {
            return balance;
        }
    }

    class CurrentAccount implements Account {

        private double balance;
        private double overdraftLimit;

        public CurrentAccount(double balance, double overdraftLimit) {
            this.balance = balance;
            this.overdraftLimit = overdraftLimit;
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
        }

        @Override
        public void withdraw(double amount) {
            if (balance - amount >= -overdraftLimit) {
                balance -= amount;
            } else {
                throw new RuntimeException("Cannot withdraw more than the overdraft limit");
            }
        }

        @Override
        public double calculateInterest() {
            return 0;
        }

        @Override
        public double getBalance() {
            return balance;
        }
    }

    class Bank {

        private List<Account> accounts;

        public Bank() {
            accounts = new ArrayList<>();
        }

        public void addAccount(Account account) {
            accounts.add(account);
        }

        public List<Account> getAccounts() {
            return accounts;
        }

        public static void main(String[] args) {
            Bank bank = new Bank();

            SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
            CurrentAccount currentAccount = new CurrentAccount(500, 1000);

            bank.addAccount(savingsAccount);
            bank.addAccount(currentAccount);

            System.out.println("Savings account balance: " + savingsAccount.getBalance());
            System.out.println("Current account balance: " + currentAccount.getBalance());

            savingsAccount.deposit(500);
            currentAccount.withdraw(200);

            System.out.println("Savings account balance: " + savingsAccount.getBalance());
            System.out.println("Current account balance: " + currentAccount.getBalance());
        }
    }
