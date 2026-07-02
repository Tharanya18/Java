package Day2;

public class Employee {
	public static void main(String[] args) {

	      Employee emp1 = new Employee(101, "Arul", "IT", 50000);

	      emp1.displayEmployee();
	}
  private int employeeId;
  private String employeeName;
  private String department;
  private double salary;
  
  public Employee( int employeeId , String employeeName , String department , double salary)
  {
	  this.employeeId = employeeId;
	  this.employeeName = employeeName;
	  this.department = department;
	  this.salary = salary;
  }
  public void displayEmployee() {
      System.out.println("Employee ID: " + employeeId);
      System.out.println("Employee Name: " + employeeName);
      System.out.println("Department: " + department);
      System.out.println("Salary: " + salary);
  }
}
