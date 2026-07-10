package Day3;

public class StringsOperations {
   public static void main(String[] args)
   {
	   String name =  " arul antran vijay ";
	   String email = " arul@company.com";
	   String department = "Computer Science";
	   
	   System.out.println("1.remove unwanted spaces");
	   System.out.println(name.trim());
	   System.out.println("2.name to uppercase");
	   System.out.println(name.toUpperCase());
	   System.out.println("3.name to lowercase");
	   System.out.println(name.toLowerCase());
	   System.out.println("4. number of characters in the name ");
	   System.out.println(name.trim().length());
	   /*int count = 0 ;
	   for( int i = 0; i< name.length() ; i++)
	   {
		   if(name.charAt(i) != ' ')
			   count++;
	   }
	   System.out.println(count);*/
	   System.out.println("5.email belongs to the company domain");
	   if (email.endsWith("company.com")){
		   System.out.println("yes its belongs to company");
	   }
	   System.out.println("6.name starts with letter A");
	   System.out.println(name.trim().toUpperCase().startsWith("A"));
	   System.out.println("7.postion of the first occurence of 'a'");
	   System.out.println(name.trim().indexOf('a'));
	   System.out.println("8.replace space with underscore");
	   System.out.println(name.trim().replace(" ", "_"));
	   System.out.println("9.extract first four characters from name");
	   System.out.println(name.trim().substring(0, 4));
	   System.out.println("10.compare department with another department name");
	   if(department.equals("Computer Science")) {
		   System.out.println("yes it is equal");
	   }
	   
   }
}
