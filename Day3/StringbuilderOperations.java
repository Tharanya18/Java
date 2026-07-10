package Day3;

public class StringbuilderOperations {
   public static void main(String[] args)
   {
	   StringBuffer username = new StringBuffer("JavaUser");
	   System.out.println(username.append("123"));
	   System.out.println(username.insert(4, "Pro"));
	   System.out.println(username.replace(7,11 , "Developer"));
	   System.out.println(username.delete(username.length()-3, username.length()));
	   System.out.println(username.reverse());
	   System.out.println(username.length());
	   System.out.println(username.capacity());
	   System.out.println(username.charAt(2));
	   username.setCharAt(0, 'X');
	   System.out.println(username);
	   System.out.println(username.toString());
	   
   }
}
