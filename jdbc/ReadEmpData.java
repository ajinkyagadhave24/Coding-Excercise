package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadEmpData {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","seed1234");
			System.out.println("connection Done Successfully....");
			
			Statement stat=con.createStatement();
			ResultSet res=stat.executeQuery("select * from employees");
			
			System.out.println("EMPLOYEE_ID   FIRST_NAME  LAST_NAME   SALARY    DEPARTMENT_ID");
			System.out.println("------------------------------------------------------------------");
			while(res.next()){
				System.out.println(res.getInt("EMPLOYEE_ID")+"      "
										+res.getString("FIRST_NAME")+"      "
										+res.getString("LAST_NAME")+"       "
										+res.getInt("SALARY")+"      "
										+res.getInt("DEPARTMENT_ID"));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
