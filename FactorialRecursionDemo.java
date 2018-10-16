
public class FactorialRecursionDemo 
{
	public static void main(String[] args) 
	{
		int n=7,fact=1;
		
		fact=factorial(n);
		
		
		System.out.println("Factorial of "+n+" is "+fact);
		
		
	}
	
	public static int factorial(int number)
	{
		if(number==0)
			return 1;
		else
		 return number*factorial(number-1);
	}

}
