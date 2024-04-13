package application.bank;

public interface Account {
	void checkBalance();
    void deposit(double amount);
    void withdraw(double amount);
}
