package Day3;
interface College{
	String collegeName = "KCE";
	static void displayCollege() {
		System.out.println("COLLEGE NAME: "+collegeName);
	}
}
class Studentt implements College{
	int rollno;
	String name;
	
	public Studentt(int rollno , String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	void displayStudentDetails() {
		System.out.println("STUDENT ROLLNO : " + rollno);
		System.out.println("STUDENT NAME : "+ name);
	}
}
public class CollegeDetails {
  public static void main(String[] args) {
	  Studentt s = new Studentt( 101 , "Tharanya");
	  College.displayCollege();
	  s.displayStudentDetails();
  }
}
