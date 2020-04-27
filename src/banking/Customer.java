package banking;

public class Customer {
	private String firstName;
	private String lastName;
	private Account konto;
	
	public Customer(String f, String l) {
		firstName=f;
		lastName=l;	
		System.out.println("Tworzenie klient "+f+l);
		konto = new Account(500);
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Account getAccount() {
		return konto;
	}
	public void setAccount(Account acct) {
		konto=acct;
	}

}
