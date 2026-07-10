package Day3;
abstract class Personn{
	String name;
	int age;
	
	Personn(String name , int age){
		this.name = name;
		this.age = age;
	}
	abstract void displayDetails();
}
interface SalaryCalculation{
	 double calculateSalary();
}

class Empl extends Personn implements SalaryCalculation{
	
	int employeeId ;
	double basicsalary;
	
	Empl (String name , int age, int employeeId,double basicsalary ){
		super(name , age);
		this.employeeId = employeeId;
		this.basicsalary = basicsalary;
		
	}
	 void displayDetails() {
		 System.out.println("EMPLOYEEID : " +employeeId);
		 System.out.println("EMPLOYEE NAME : " + name);
		 System.out.println("AGE : "+ age);
		 
	 }
	 public double calculateSalary() {
		return basicsalary;
	 }
}
public class Excersice10 {
  public static void main(String[] args)
  {
	  Empl e = new Empl ("Tharanya" , 18 , 101,5000.00);
	  e.displayDetails();
	  System.out.println("SALARY: " + e.calculateSalary());
  }
}
