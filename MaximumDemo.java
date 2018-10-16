import java.util.Scanner;


public class MaximumDemo 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  int n,max;
	  
	  System.out.println("Enter Number Of Elements : ");
	  n=sc.nextInt();
	  
	  int numbers[]=new int[n];
	  
	  System.out.println("Enter The Elements : ");
	  for(int j=0;j<n;j++)
	  {
		  numbers[j]=sc.nextInt();
	  }
	  max=numbers[0];
	  
	  for(int i=0;i<n;i++)
	  {
		  if(max<numbers[i])
			  max=numbers[i];
		  
	  }
	  
	  System.out.println("Maximum= "+max);
	  
	}

}
