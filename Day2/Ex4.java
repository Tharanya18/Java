package Day2;
import java.util.Scanner;
public class Ex4 {
   public static void main(String[] args)
   {
	   Scanner sc =  new Scanner(System.in);
	   int n = sc.nextInt();
	   int m = sc.nextInt();
	   int[][] student = new int[n][m];
	   
	   for( int i = 0 ; i < n ; i++)
	   {
		   for( int j = 0 ; j < m ; j++)
		   {
			   student[i][j] = sc.nextInt();
		   }
	   }
	   
	   Ex4 obj = new Ex4();
	   obj.StudentDetails(student , n , m);
   }
   public void StudentDetails(int student[][] , int n , int m)
   {
	   int sum = 0 ;
	   int[] totalmarks = new int[n];
	   for( int i = 0 ; i < n ; i++)
	   {
		   for( int j = 0 ; j < m ; j++)
		   {
			   sum += student[i][j];
			   
		   }
		   totalmarks[i]=sum;
		   System.out.println("TOTAL MARK OF STUDENT"+ i +":" +sum );
		   System.out.println("AVERAGE MARK OF EACH STUDENT " + i +":" + sum/m);
	   }
	   System.out.println("TOPPER STUDENT NUMBER:");
	   int max = 0 ,i;
	   for(  i = 0 ; i < totalmarks.length ; i++)
	   {
		   if ( max < totalmarks[i])
		   {
			   max = i ;
		   }
	   }
	   System.out.print(i);
   }
}
