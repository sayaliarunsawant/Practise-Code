
public class AmstrongNumber 
{
	public static void main(String[] args) 
	{
		int r,c=0,temp;
		int n=153;//It is the number for checking amstrong or not
		temp=n;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			c=c+(r*r*r);
			
		}
		
		if(temp==c)
			System.out.println(n+" is a Amstrong Number");
		else
			System.out.println(n+" is not a Amstrong Number");
				
	}

}
