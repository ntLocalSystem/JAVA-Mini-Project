import MarksOutofBoundException;

public class exp11 {

	public void checkmarks(int marks) throws MarksOutofBoundException
	{
		if(marks<0 || marks >100)
		{
			throw new MarksOutofBoundException(marks);
		}
	}
	
	
	
	
	public static void main(String args[])
	{
		
		
	}
	
	
}
