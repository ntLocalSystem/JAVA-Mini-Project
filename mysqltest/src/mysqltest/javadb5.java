package mysqltest;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.io.*;
import java.util.*;

public class javadb5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?verifyServerCertificate=false&useSSL=true","root","");
			PreparedStatement stmt = con.prepareStatement("update student set s_name = 'Rohit the great' where s_id=? and s_name = ?");
			System.out.println("Enter the value of the Student ID");
			int ID;
			String name;
			ID = sc.nextInt();
			name = br.readLine();
			
			stmt.setInt(1,ID);
			stmt.setString(2, name);
			
			
			stmt.executeUpdate();
			
			
		    System.out.println("Update Query Done");
		}
		catch(Exception except)
		{
			System.out.println( except  );
			
		}
		
		
		

	}

}
