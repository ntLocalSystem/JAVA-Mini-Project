package mysqltest;
// You need to extend the exception to throw it
public class MarksOutOfBoundException extends Exception {

	int marks;
	
	public MarksOutOfBoundException(int marks1)
	{
		this.marks = marks1;
		
		
	}
	
	public String toString()
	{
		return "The entered marks "+marks+"are invalid."; 
	}
	
	
}
