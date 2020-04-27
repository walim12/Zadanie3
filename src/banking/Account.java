package banking;

public class Account {
	private double balance;
	
	public Account(double init_balance) {
		balance=init_balance;
		System.out.println("Tworzenie konta z saldem "+balance);
	}
	public double getBalance() {
		return balance;
	}
	public boolean deposit(double amt) {
		System.out.println("Wp³ata " + amt);
		if (amt>0) {
			balance+=amt;
			return true;		
		}
		return false;
	}
	public boolean withdraw(double amt) {
		System.out.println("Wyp³ata "+amt);
		if (amt>0 && amt<balance) {
			balance-=amt;
			return true;
		}
		return false;
	}
	
}
