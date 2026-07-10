package Day3;
class EmployyeDetails {
     int employeeId;
     String employeeName;
     int salary;
     
     EmployyeDetails(int employeeId , String employeeName , int salary){
    	 this.employeeId = employeeId;
    	 this.employeeName = employeeName;
    	 this.salary = salary;
     }
     
     void display() {
    	 System.out.println("ID : "+employeeId);
    	 System.out.println("NAME : "+employeeName);
    	 System.out.println("SALARY: " +salary);
     }
}
public class Employye{
	public static void main(String[] args)
	{
		EmployyeDetails[] emp = new EmployyeDetails[5];
		emp[0] = new EmployyeDetails ( 101 , "tharanya" , 50000);
		emp[1] = new EmployyeDetails ( 102 , "abinaya" , 10000);
		emp[2] = new EmployyeDetails ( 103 , "priya" , 60000);
		emp[3] = new EmployyeDetails ( 104 , "mithula" , 15000);
		emp[4] = new EmployyeDetails ( 105 , "tharika" , 45000);
		
		for( EmployyeDetails e : emp) {
			if(e.salary >30000) {
				e.display();
			}
		}
	}
}
