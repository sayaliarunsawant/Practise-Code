
public class StringreverseDemo 
{
	public static void main(String[] args)
	{
		

		String str="Sayali",name="";
		char[] rev=str.toCharArray();
	
		for(int i=rev.length-1;i>=0;i--)
		{
			name=name+rev[i];
		}
	
		System.out.println("Reverse Of "+str+" is "+name);
	}	

}
