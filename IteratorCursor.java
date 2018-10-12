import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursor 
{
	public static void main(String[] args) 
    {
    	ArrayList<String> al = new ArrayList<>();
    	
    	String[] str={"Sayali","Prajakta","Pooja","Namrata","Prachi"};
    	
    	for(int i= 0;i<str.length;i++)
    	{
    	   al.add(str[i]);
    		
    	}
    	
    	Iterator<String> itr = al.iterator();
    	
    	while(itr.hasNext())
    	{
    		System.out.println(itr.next());
    	}
    	
    }
}
