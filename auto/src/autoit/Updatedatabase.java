package autoit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Updatedatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		Connection conn=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		conn=DriverManager.getConnection("jdbc:oracle:thin:@system8-PC:1521:XE","SYSTEM","admin");
		
		String sql1="Update SYSTEM.KISHOR set ADDRESS='Warangal' where ID=4";
		
		PreparedStatement st1=conn.prepareStatement(sql1);
		
		st1.executeUpdate();
		
		// verify the value update
		
		String sql2="Select ADDRESS from SYSTEM.KISHOR where ID=4";
		
		Statement stmt=conn.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql2);
		
		while(rs.next())
		{
			System.out.println(rs.getString("ADDRESS"));
		}

	}
	
}
