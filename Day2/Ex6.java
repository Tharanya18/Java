package Day2;
import java.util.Scanner;
public class Ex6 {
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  String email =  sc.nextLine();
	  
	  if(email.endsWith("@company.com"))
	  {
		  System.out.println("valid company email");
	  }
	  else {
		  System.out.println("Invalid company email");
	  }
  }
}
