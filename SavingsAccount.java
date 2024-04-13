package application.bank;

public class SavingsAccount implements Account {
    private double balance;

    @Override
    public void checkBalance() {
        System.out.println("Savings Account Balance: $" + balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited into Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn from Savings Account.");
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }
}
