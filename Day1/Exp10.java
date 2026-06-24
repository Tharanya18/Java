package Day1;

public class Exp10 {
   public static void main(String[] args)
   {
	   int a = 30 ; 
	   int b = 20 ; 
	   System.out.println("Before swap a and b:" + a +" " + b);
	   //using temp variable swap them
	   int temp = a;
	   a = b ;
	   b = temp ; 
	   System.out.println("using temp ");
	   System.out.println("After swap a and b:" + a + " " + b);
	   
	   
	   //without using temp
	   System.out.println("without using temp");
	   a = a+b ; 
	   b = a-b;
	   a = a-b;
	   
	   System.out.println("After swap a and b:" + a + " " + b);
	       
   }
}
