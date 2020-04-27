package banking;

public class TestBanking {
	
	public static void main(String[] args) {
		/*Account pierwszyAccount = new Account(500);	
		pierwszyAccount.withdraw(150.00);
		pierwszyAccount.deposit(22.50);
		pierwszyAccount.withdraw(47.62);
		System.out.println("Saldo na koncie " + pierwszyAccount.getBalance());*/
		
		Customer klient = new Customer("Jane","Smith");	

		System.out.println("czy wysz這? - "+klient.getAccount().withdraw(150));
		System.out.println("czy wysz這? - "+klient.getAccount().withdraw(-150));
		System.out.println("czy posz這? -  "+klient.getAccount().deposit(22.50));	
		System.out.println("czy posz這? -  "+klient.getAccount().deposit(-22.50));		
		System.out.println("czy wysz這? - "+klient.getAccount().withdraw(2150));
		System.out.println("czy wysz這? - "+klient.getAccount().withdraw(-150));
		//klient.getAccount().deposit(500);
		System.out.println("Saldo na koncie " + klient.getAccount().getBalance());
	}
	

}