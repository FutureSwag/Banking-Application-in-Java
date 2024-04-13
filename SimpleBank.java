package application.bank;

public class SimpleBank implements Bank {
	 @Override
	    public Account createAccount() {
	        return new SavingsAccount(); // Creating SavingsAccount by default
	    }
}
