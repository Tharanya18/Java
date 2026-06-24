package Day1;
import java.util.Scanner;
public class Exp9 {
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter salary: ");
			double basesal=sc.nextInt();
			double hra=basesal*0.20;
			double da=basesal*0.10;
			double salTemp=basesal+hra+da;
			double tax=salTemp*0.05;
			double salFin=salTemp-tax;
			System.out.println("Salary: "+salFin);
	}
}
