package autoit;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnections {
 
	public static void main(String[] args) throws SQLException {
	             
		Connection conn=null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		
			conn=DriverManager.getConnection("jdbc:oracle:thin:@system8-PC:1521:XE", "SYSTEM","admin");
			
			
			java.sql.Statement stmt=conn.createStatement();
			
			ResultSet rs=stmt.executeQuery("Select * from SYSTEM.KISHOR");
			
			while(rs.next())
			{
				
				System.out.println(rs.getString("ID")+" "+rs.getString("NAME")+" "+rs.getString("ADDRESS")+" "+rs.getString("AGE")+" "+rs.getString("SALARY"));
				
			}
		}
				catch(SQLException se)
				{
					System.out.println("Sql Exception"+se);
				}
				
				catch(ClassNotFoundException cnfe)
				{
					System.out.println("Class not found Exception"+cnfe);
					
				}
				finally
				{
					try
					{
						if(conn !=null)
							conn.close();
					}
				
				catch(SQLException e)
					{
					e.printStackTrace();
					}
				
				
				}
				
	}
}
	
