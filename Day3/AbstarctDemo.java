package Day3;
abstract class BankAccount{
	abstract void calculateInterest();
	
	void displayBankName()
	{
		System.out.println("STATE BANK OF INDIA");
	}
}
class SavingsAccount extends BankAccount{
	int balance ;
	SavingsAccount ( int balance)
	{
		this.balance = balance;
	}
	void calculateInterest() {
		displayBankName();
		System.out.println("INTEREST:" +balance*0.04);
	}
}
class CurrentAccount extends BankAccount{
	int balance ;
	CurrentAccount ( int balance)
	{
		this.balance = balance;
	}
	void calculateInterest() {
		displayBankName();
		System.out.println("INTEREST:" +balance*0.08);
	}
}
public class AbstarctDemo {
	public static void main(String[] args) {
		 SavingsAccount s = new SavingsAccount(1000);
	     CurrentAccount c = new CurrentAccount(2000);
	     
	     s.calculateInterest();
	     c.calculateInterest();
	}
    
     
}
