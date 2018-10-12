import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursorDemo implements Comparable<Integer>
{
    public static void main(String[] args) 
    {
   
   
    	Vector<String> v = new Vector<>();
    	
    	String[] str={"Sayali","Prajakta","Pooja","Namrata","Prachi"};
    	
    	for(int i= 0;i<str.length;i++)
    	{
    		v.add(str[i]);
    		
    	}
    	
    	Enumeration<String> e = v.elements();
    	
    	while(e.hasMoreElements())
    	{
    		System.out.println(e.nextElement());
    	}
    	
    	
    	
		
	}

	@Override
	public int compareTo(Integer age) 
	{
		if(age<0)
	     return -1;
		else if(age>0)
			return 1;
		else return 0;
		
	}
	

}
