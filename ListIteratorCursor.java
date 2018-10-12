import java.util.LinkedList;
import java.util.ListIterator;


public class ListIteratorCursor 
{
	public static void main(String[] args) 
    {
    	LinkedList<String> ll = new LinkedList<>();
    	
    	String[] str={"Sayali","Prajakta","Pooja","Namrata","Prachi"};
    	
    	for(int i= 0;i<str.length;i++)
    	{
    		ll.add(str[i]);
    		
    	}
    	
    	ListIterator<String> litr = ll.listIterator(ll.size());
    	
    	while(litr.hasPrevious())
    	{
    	  System.out.println(litr.previous());
    	}
    	

   }
}
