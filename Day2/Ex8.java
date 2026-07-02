package Day2;
import java.util.Scanner;
public class Ex8 {
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);

     String mobile = sc.nextLine();

     StringBuffer sb = new StringBuffer(mobile);

     sb.replace(0, 6, "******");

     System.out.println(sb);
 }
}
