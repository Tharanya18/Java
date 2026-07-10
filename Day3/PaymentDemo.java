package Day3;
interface Payment{
	
	void makePayment(double amount);
			
}
class UPIPayment implements Payment{
	
	public void makePayment(double amount)
	{
		System.out.println("UPI PAYMENT: " + amount);
	}
}
class CardPayment implements Payment{
	
	public void makePayment(double amount)
	{
		System.out.println("CARD PAYMENT: " + amount);
	}
}

public class PaymentDemo {
   public static void main(String[] args) {
	   UPIPayment up = new UPIPayment();
	   CardPayment cp = new CardPayment();
	   up.makePayment(1000);
	   cp.makePayment(2000);
   }
}
