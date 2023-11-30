package mysqltest;
import mysqltest.MarksOutOfBoundException;
import java.util.*;

public class exp11 {
	
	public static void main(String args[])
	{
		int marks= 0;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the marks");
			marks = sc.nextInt();
			checkmarks(marks);
			
		}
		catch(MarksOutOfBoundException e)
		{
			
			System.out.println(e);
			
		}
	}
	
	
	
	
	
	public static void checkmarks(int marks) throws MarksOutOfBoundException
	{try {
		if(marks<0 || marks >100)
		{
			throw new MarksOutOfBoundException(marks);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	
	
	

	
}
