package Day1;

public class Exp4 {
   public static void main(String[] args)
   {
	  byte b = 20; // -128 to 127
	  short s = 30 ;  // -32768 to 32767
	  int num = 50; //2,147,483,648 to 2,147,483,647
	  long l = 1234567839859L; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	  float f = 12.3f; //Approximately ±3.4 × 10^38
	  double pi = 3.1415925849; //Approximately ±1.7 × 10^308
	  char c = 'A'; //0 to 65,535 (Unicode characters)
	  boolean isbool = true;
	  
	  System.out.println(b);
	  System.out.println(s);
	  System.out.println(num);
	  System.out.println(l);
	  System.out.println(f);
	  System.out.println(pi);
	  System.out.println(c);
	  System.out.println(isbool);
   }
}
