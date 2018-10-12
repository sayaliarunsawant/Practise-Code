import java.lang.reflect.Constructor;

public class StringDemo 
{
	public static void main(String[] args)
	{
		//By using new Keyword
		StringDemo sd1 = new StringDemo();
		
		//By Using Class.newInstance() Method
		try 
		{
			StringDemo sd2 = (StringDemo) Class.forName("StringDemo").newInstance();
		} catch (InstantiationException e)
		{
			
			e.printStackTrace();
		} 
		catch (IllegalAccessException e)
		{
			
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		try
		{
			StringDemo sd3 = StringDemo.class.newInstance();
		} 
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		/*By using newInstance() method of Constructor Class
		Constructor<StringDemo> constructor = StringDemo.class.getConstructor();
		StringDemo sd4=constructor.newInstance();
		
		
		By using clone() Method
		Employee emp4 = (Employee) emp3.clone();
		
		By using deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
        Employee emp5 = (Employee) in.readObject();
		
		 */
		
		String s ="Sayali";
		
		String s1 = new String("Sayali");
		
		System.out.println(s1+s);
		
		
		
	}

}
