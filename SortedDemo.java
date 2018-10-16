import java.util.Scanner;


public class SortedDemo 
{
  public static void main(String[] args) 
  {
	  Scanner sc = new Scanner(System.in);
	  int n,temp;
	  
	  System.out.println("Enter Number Of Elements : ");
	  n=sc.nextInt();
	  
	  int numbers[]=new int[n];
	  
	  System.out.println("Enter The Elements : ");
	  for(int j=0;j<n;j++)
	  {
		  numbers[j]=sc.nextInt();
	  }
	  
	  
	  for(int i=0;i<n;i++)
	  {
		  for(int k=i+1;k<n;k++)
		  {
			  if(numbers[i]>numbers[k])
			  {
				  temp=numbers[i];
				  numbers[i]=numbers[k];
				  numbers[k]=temp;
			  }
			  
		  }
	  }
	  
	  System.out.println("Sorting ");
	  
	  for(int l=0;l<n;l++)
	  {
		  System.out.println(numbers[l]);
	  }
	  
	  
  }

}
