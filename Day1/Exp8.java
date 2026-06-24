package Day1;
import java.util.Scanner;
public class Exp8 {
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   int total = 0;
	   System.out.println("Enter n:");
	   int n = sc.nextInt();
	   int[] subjects =  new int[n];
	   System.out.println("Enter marks:");
	   for( int i = 0 ; i < n ; i++)
	   {
		   subjects[i] = sc.nextInt();
		   total = total+subjects[i];	   
	   }
	   
	   double average = total / 5.0;
	   double percentage = (total / 500.0)*100;
	   
	   System.out.println("Total marks: " + total);
	   System.out.println("Average marks: " + average);
	   System.out.println("Percentage marks: " + percentage + "%");
	   
   }
}
