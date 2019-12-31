package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {
	Connection con;
	Statement stat;
	ResultSet res;
	
	public ReadData()


	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Database Connected....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void getData()
	{
		try 
		{
			stat=con.createStatement();
			res=stat.executeQuery("select * from employees");
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public void printData()
	{
		try
		{
			while(res.next())
			{
				System.out.println(res.getInt("EMPLOYEE_ID"));
				System.out.println(res.getString("FIRST_NAME"));
				System.out.println(res.getString("LAST_NAME"));
				System.out.println(res.getInt("SALARY"));
				System.out.println(res.getInt("DEPARTMENT_ID"));
				System.out.println("===============================");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ReadData rd=new ReadData();
		rd.getData();
		rd.printData();

	}

}

