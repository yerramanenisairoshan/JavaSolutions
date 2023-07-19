package Inheritance;

public class SavingsAccount extends BankAccount {

    public SavingsAccount() {
        super();
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw, balance will fall below 100");
        }
    }
}
