package application.bank;

public class CurrentAccount implements Account {
    private double balance;

    @Override
    public void checkBalance() {
        System.out.println("Current Account Balance: $" + balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited into Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn from Current Account.");
        } else {
            System.out.println("Insufficient funds in Current Account.");
        }
    }
}
