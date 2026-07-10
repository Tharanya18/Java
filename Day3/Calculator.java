package Day3;

 class CalculatorResult {

	public int add( int a , int b)
	{
		return a+b;
	}
	public int add( int a , int b , int c)
	{
		return a+b+c;
	}
	public double add( double a , double b)
	{
		return a+b;
	}
}
 public class Calculator{
	 public static void main(String[] args)
	 {
		 CalculatorResult result =  new CalculatorResult();
		System.out.println( result.add(10, 20));
		 System.out.println(result.add(10,20,30));
		 System.out.println(result.add(10.5,11.5));
	 }
 }
