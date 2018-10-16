import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;


public class SortingOfElements 
{
	
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(100);
		al.add(1);
		
		System.out.println("Before Sorting : "+al);
		
		SortedSet<Integer> set = new TreeSet<Integer>(al);
		
		
		System.out.println("Afetr Sorting : "+set);
	}

}
