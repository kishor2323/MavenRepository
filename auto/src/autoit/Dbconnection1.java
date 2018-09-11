package autoit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbconnection1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		Connection conn=null;
		
		//load the driver class
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// create the connection using the static getConnection Method
		
		conn=DriverManager.getConnection("jdbc:oracle:thin:@system8-PC:1521:XE","SYSTEM","admin");
		
		//Create a statement class to execute the SQL statement
		
		Statement stmt=conn.createStatement();
		
		//ecexute the SQL statement and get results in a RESULTset
		
		ResultSet rs=stmt.executeQuery("select * from system.kishor");
		
		int colCount=rs.getMetaData().getColumnCount();
		
		while (rs.next())
		{
			String row="";
			for(int i=1; i<=colCount;i++)
			{
				row+=rs.getMetaData().getColumnName(i)+",";
			
		}

		System.out.println(row);
		break;
	}
	while(rs.next())
	{
		String row="";
				for(int i=1;i<=colCount;i++)
				{
				row+=rs.getString(i)+",";	
				}
		
				System.out.println(row);
		
	}

}
}