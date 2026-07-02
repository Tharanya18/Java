package Day2;
import java.util.Scanner;
public class Ex3 {
  public static void main( String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int[] arr = new int[n];
	  for( int i = 0 ; i < n ; i++)
	  {
		  arr[i] = sc.nextInt();
	  }
	  Ex3 obj = new Ex3();
	  obj.MoveZeros(arr);
	  
	  for( int i = 0 ; i < n ; i++)
	  {
		  System.out.print(arr[i] + " ");
	  }
  }
  public void swap( int arr[] , int a , int b)
  {
	  int temp =arr[a];
	  arr[a] = arr[b] ;
	  arr[b] = temp;
  }
  public void MoveZeros( int arr[])
  {
	  int j = -1;
	  for( int i = 0 ; i < arr.length ; i++)
	  {
		  if( arr[i] == 0)
		  {
			  j =i;
			  break;
		  }
	  }
	  for( int i = j+1 ; i < arr.length ; i++)
	  {
		  if( arr[i] != 0) {
			  swap(arr , i , j);
			  j++;
		  }
	  }
  }
  
}
