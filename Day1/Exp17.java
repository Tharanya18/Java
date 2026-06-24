package Day1;

class BankAccount1{
	
	private double Balance;
	
	BankAccount1 (double Balance)
	{
		this.Balance = Balance;
	}
	
	void deposit( double amount)
	{
		Balance += amount;
		System.out.println("Deposited successfully");
	}
	
	void withdraw( double amount)
	{
		if(amount <Balance) {
		Balance -= amount;
		System.out.println("withdraw successfully");
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	void checkbalance() {
		System.out.println("The current Balance:" + Balance);
	}
}
public class Exp17 {
	public static void main(String[] args) {
	BankAccount1 bankacc = new BankAccount1(5000);
	bankacc.checkbalance();
	bankacc.deposit(1000);
	bankacc.checkbalance();
	bankacc.withdraw(7000);
	
	
	}	

}
