import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceDemo
{
	public static void main(String[] args)
	{
		try (BufferedReader br = new BufferedReader(new FileReader("./src/TryWithResourceDemo.java")))
		{
			System.out.println(br.readLine());
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
