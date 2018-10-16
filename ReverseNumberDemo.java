
public class ReverseNumberDemo 
{
	
	public static void main(String[] args) 
	{
		int n=798,rem,rev=0;
		
		while(n>0)
		{
			rev=rev*10;
			rem=n%10;
			rev=rev+rem;
			n=n/10;
		}
		System.out.println("Reverse is "+rev);
	}

}
