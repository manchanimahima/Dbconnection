package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sampleDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/productmgmt", "root", "Mahima5678@");
		Statement st = ct.createStatement();
		
		ResultSet rs = st.executeQuery("select * from productinfo");
		
		while(rs.next())
		{
		System.out.println(rs.getString("name"));
		System.out.println(rs.getInt(1));
		//System.out.println(rs.getString(3));
		System.out.println(rs.getString("price"));
		}

		
	}

}
