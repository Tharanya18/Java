package Day2;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int[] salaries = new int[n];
		for (int i = 0; i < n; i++) {
	        salaries[i] = sc.nextInt();
	    }
		Ex1 obj = new Ex1();
		obj.Highest(salaries);
		obj.Lowest(salaries);
		obj.Average(salaries , n);
		obj.AboveAverageEmp(salaries , n);
	}
	
	public void Highest(int highest[])
	{
		int max = 0 ; 
		for( int n : highest)
		{
			if( max < n)
				max= n ;
		}
		System.out.println("HIGHEST SALARY: "+ max);
	}
	public void Lowest(int lowest[])
	{
		int min = Integer.MAX_VALUE ; 
		for( int n : lowest)
		{
			if( min > n)
				min = n ;
		}
		System.out.println("LOWEST SALARY: "+ min);
	}
	public void Average(int average[] , int total)
	{
		int sum = 0 ;
		for( int n : average)
		{
			sum += n;
		}
		System.out.println("AVERAGE SALARY: "+ (sum/total));
		
	}
	public void AboveAverageEmp(int average[] , int total)
	{
		int sum = 0 ;
		for( int n : average)
		{
			sum += n;
		}
		double averagemark = sum/total;
		System.out.println("EMPLOYEES EARNING ABOVE AVERAGE: ");
		for( int n : average)
		{
			if( n > averagemark)
				System.out.print( n + " ");
		}
	}
}
