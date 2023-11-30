package mysqltest;

import java.sql.*;

public class javadb2 {

	public static void main(String[] args)  {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?verifyServerCertificate=false&useSSL=true","root","");
			Statement stmt = con.createStatement();
			// result set contains the rows that satisfy the query
			// statement object allows the module to know which type of statement and also allow its execution
			// the connector allows the java application to communicate with the MySQL database
			// SQL module contains all the methods necessary to communicate with the database since driver allows it
			String insert = "insert into student"+"(s_id,s_name,s_phn)"+"values (13377,\"Surabhi\",9769005478)";
		    stmt.executeUpdate(insert);
		    /*
			while(rs.next())
			{
				System.out.println(" S_ID is  " + rs.getInt("s_id")  + "\n" + "S_NAME is" + rs.getString("s_name" )  + "\n" + "S_PHONE is" + rs.getInt("s_phn" ));
			}
			*/
		    System.out.println("Query Executed");
		}
		catch(Exception except)
		{
			System.out.println( except  );
			
		}
		

	}

}