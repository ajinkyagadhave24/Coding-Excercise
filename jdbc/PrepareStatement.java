package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class  PrepareStatement{
	
	Connection con;
	Statement stat;
	int rollno;
	String name;
	PrepareStatement pre;
	
	public PrepareStatement()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Connected Successfully.....");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student rollno.");
			rollno=sc.nextInt();
			System.out.println("Enter Student Name");
			name=sc.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void insertStatement()

	{
		try
		{
			stat=con.createStatement();
			int ra=stat.executeUpdate("insert into student1 values("+rollno+",'"+name+"')");
			if(ra>0)
				System.out.println("Record Inserted...");
			else
				System.out.println("Record Not Inserted...");
				
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void insertPreStatement(){
		try
		{
			pre=(PrepareStatement) con.prepareStatement("insert into student1 values(?,?)");
			((PreparedStatement) pre).setInt(1,rollno);
			((PreparedStatement) pre).setString(2,name);
			
			int ra=((PreparedStatement) pre).executeUpdate();
			if(ra>0)
				System.out.println("Record Inserted...");
			else
				System.out.println("Record Not Inserted...");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		PrepareStatement s=new PrepareStatement();
		s.insertStatement();
		//s.insertPreStatement();
	}

}
