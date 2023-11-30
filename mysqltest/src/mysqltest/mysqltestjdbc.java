package mysqltest;

import java.sql.*;

public class mysqltestjdbc {

	public static void main(String[] args)  {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?verifyServerCertificate=false&useSSL=true","root","");
			Statement stmt = con.createStatement();
			// result set contains the rows that satisfy the query
			// statement object allows the module to know which type of statement and also allow its execution
			// the connector allows the java application to communicate with the MySQL database
			// SQL module contains all the methods necessary to communicate with the database since driver allows it
			ResultSet rs = stmt.executeQuery("select * from student where s_name = 'Rohit' ");
			while(rs.next())
			{
				System.out.println(" S_ID is  " + rs.getInt("s_id") );
			}
			
		}
		catch(Exception except)
		{
			System.out.println( except  );
			
		}
		

	}

}
