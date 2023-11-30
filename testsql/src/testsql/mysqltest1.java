package testsql;
import java.sql.*;
import java.io.*;
import java.util.*;

public class mysqltest1 {

	public static void main(String[] args) {
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project?verifyServerCertificate=false&useSSL=true","root","");
			System.out.println("Enter your agent id");
			Scanner sc = new Scanner(System.in);
			int y = sc.nextInt();
			
			PreparedStatement stmt = con.prepareStatement(" Select Insurance from agentinfo where agent_id=? ");
			stmt.setInt(1, y);
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				String ans = rs.getString(1);
				System.out.println(ans);
			}
			
			
			
			PreparedStatement stmt1 = con.prepareStatement(" Select username,password,mobileno,email from logininfo");
			ResultSet rs1 = stmt.executeQuery();
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			
			
		}
		
		
		
		
		
		

	}

}
