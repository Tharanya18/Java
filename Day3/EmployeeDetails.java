package Day3;
class Employee{
	void calculateSalary()
	{
		
	}
}
class FullTimeEmployee extends Employee{
	private int monthlySalary;
	
	FullTimeEmployee(int monthlySalary)
	{
		this.monthlySalary = monthlySalary;
	}
	void calculateSalary() {
		System.out.println("FULL TIME SALARY:" + monthlySalary);
	}
}
class PartTimeEmployee extends Employee{
	private int hoursWorked;
	private int ratePerHour;
	
	PartTimeEmployee(int hoursWorked , int ratePerHour )
	{
		this.hoursWorked = hoursWorked;
		this.ratePerHour = ratePerHour;
	}
	void calculateSalary() {
		System.out.println("PART TIME SALARY:" + hoursWorked*ratePerHour);
	}
}
public class EmployeeDetails {
   public static void main(String[] args)
   {
	   Employee fulltime = new FullTimeEmployee(50000);
	   Employee parttime = new PartTimeEmployee(2 , 5000);
	   fulltime.calculateSalary();
	   parttime.calculateSalary();
   }
}
