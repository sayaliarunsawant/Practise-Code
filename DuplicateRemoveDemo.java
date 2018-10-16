import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.Set;


public class DuplicateRemoveDemo 
{
	public static void main(String[] args)
	{
		ArrayList< Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);	
		al.add(20);	
		al.add(10);
		
		System.out.println("Before removing duplicates Elements : "+al);
		
	    Set<Integer> set = new LinkedHashSet<Integer>(al);
	    
	    System.out.println("After Removing Duplicates Elements : "+set);
	
	}

	
}
