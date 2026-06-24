package Day1;
class Employeee{
	private int empId;
	private String empName;
	private int empSalary;
	
	Employeee (){
		
	}
	
	Employeee( int empId)
	{
		this.empId = empId;
	}
	Employeee ( int empId , String empName , int empSalary)
	{
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
}
public class Exp15 {
 public static void main( String[] args)
 {
	 Employeee e1 = new Employeee();
	 e1.setEmpId(101);
	 e1.setEmpName("ravi");
	 e1.setEmpSalary(10000);
	 
	 Employeee e2 = new Employeee (102);
	 e2.setEmpName("Priya");
	 e2.setEmpSalary(20000);
	 
	 Employeee e3 = new Employeee ( 103 , "deena" , 60000);
	 
	 System.out.println( e1.getEmpId());
	 System.out.println(e1.getEmpName());
	 System.out.println(e1.getEmpSalary());
	 System.out.println( e2.getEmpId());
	 System.out.println(e2.getEmpName());
	 System.out.println(e2.getEmpSalary());
	 System.out.println( e3.getEmpId());
	 System.out.println(e3.getEmpName());
	 System.out.println(e3.getEmpSalary());
	 
 }
}
