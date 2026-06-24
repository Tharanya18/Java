package Day1;

public class Exp7 {
   public static void main(String[] args) {
	   
	  //int to byte
	   int n = 1298;
	   byte b = (byte)n; // byte range:-128 to 127 java keeps only the last 8 bits
	   System.out.println(b);
	   
	   //double to float
	   double d = 23.4623698917863;
	   float fl = (float)d;
	   System.out.println(fl);
	   
	   //long to int 
	   long l = 126348787372179L;
	   int num = (int)l;
	   System.out.println(num);
   }
}
