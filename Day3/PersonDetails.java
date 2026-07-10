package Day3;

class Person{
	
	 String name;
	 int age;
	
	Person( String name , int age){
		this.name = name;
		this.age = age;
	}
}
class Student extends Person{
	private int rollNo;
	private String department;
	
	Student (String name , int age , int rollNo , String department)
	{
		super(name , age);
		this.rollNo = rollNo;
		this.department = department;
	}
	
	void studentDetails() {
		System.out.println("STUDENT NAME:" + name);
		System.out.println("STUDENT AGE:" + age);
		System.out.println("STUDENT ROLLNO:" + rollNo);
		System.out.println("STUDENT department:" + department);
	}
}
public class PersonDetails {
   public static void main(String[] args)
   {
	   Student s = new Student("Tharnya" , 18 , 101 , "CSE");
	   s.studentDetails();
   }
}
