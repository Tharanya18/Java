package Day2;
import java.util.Scanner;
public class Ex5 {
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   int[][] departments = new int[3][];
	   departments[0] = new int[]{101, 102, 103}; 
	   departments[1] = new int[]{201, 202}; 
	   departments[2] = new int[]{301, 302, 303, 304}; 
	   
	   int[] countemp = new int[3];
	   int sum = 0;
	   for( int i = 0 ; i < departments.length ; i++)
	   {
		   countemp[i] = departments[i].length;
		   sum+=countemp[i];
	   }
	   System.out.println( "Department wise employee count:");
	   for( int i = 0 ; i < countemp.length ;i++)
	   {
		   System.out.println("department"+ i + ": "+ countemp[i]);
	   }
	   System.out.println("Total employees: " + sum);
   }
}
