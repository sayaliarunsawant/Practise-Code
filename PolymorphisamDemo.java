
public class PolymorphisamDemo 
{
   public static void main(String[] args)
   {
	 A a = new B();
	 a.show();
   }	

}

class A
{
	public void show()
	{
		System.out.println("Prajakta");
	}
	
}

class B extends A
{
	public void show()
	{
		System.out.println("Sayali");
	}
	
}