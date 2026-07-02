package Day2;
import java.util.Scanner;
public class Ex2 {
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner (System.in);
	  int n = sc.nextInt();
	  int[] nums = new int[n];
	  for( int i = 0 ; i < n ; i++)
	  {
		  nums[i] = sc.nextInt();
	  }
	  Ex2 obj = new Ex2();
	  obj.SecondLargest(nums);
  }
  
  public void SecondLargest( int nums[])
  {
	  int first_max = 0 ; 
		for( int n : nums)
		{
			if( first_max < n)
				first_max= n ;
		}
		int second_max = Integer.MIN_VALUE;
		for(int n : nums)
		{
			if( second_max < n && n< first_max)
			{
				second_max = n;
			}
		}
		System.out.println("SECOND LARGEST NUMBER: "+ second_max);
  }
}
