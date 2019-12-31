package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class TableCreate {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Database Connected successfully....");
			
			CallableStatement stat=con.prepareCall("create table student1 (rollno number, name varchar2(50))");
			
			boolean result=stat.execute();
			System.out.println(result);
			if(!result)
				System.out.println("Table Created....");
			else
				System.out.println("Table Not Created....");
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
