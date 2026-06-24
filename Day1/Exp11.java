package Day1;
class Student {
	private int studentId;
	private String studentName;
	private String department;
	
	Student(){
		
	}
	
	 Student( int studentId ,String studentName ,  String department)
	{
	 this.studentId = studentId;
	 this.studentName = studentName;
	 this.department = department;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
public class Exp11 {
   public static void main(String[] args)
   {
	   Student s = new Student ( 101 , "Tharanya" , "CSE");
	   Student st = new Student (102 , "Mithula" , " CSE");
	   Student stu = new Student();
	   stu.setStudentId(103);
	   stu.setStudentName("Tharika");
	   stu.setDepartment("CSE");
	   System.out.println(s.getStudentId());
	   System.out.println(s.getStudentName());
	   System.out.println(s.getDepartment());
	   System.out.println(st.getStudentId());
	   System.out.println(st.getStudentName());
	   System.out.println(st.getDepartment());
	   System.out.println(stu.getStudentId());
	   System.out.println(stu.getStudentName());
	   System.out.println(stu.getDepartment());
   }
}
