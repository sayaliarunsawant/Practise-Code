
interface Drawable
{
	public void draw();
}

public class Demo 
{
	
	
	public static void main(String[] args) 
	{
		
		int width=10;
	
	Drawable d=()->{System.out.println("Width : "+width);};
	
	d.draw();
	}
}
