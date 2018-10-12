import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDuplicateDemo 
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(4);
		
		System.out.println(list);
		
		Set<Integer> set = new LinkedHashSet<>(list);
		
		System.out.println(set);		
	}
}
