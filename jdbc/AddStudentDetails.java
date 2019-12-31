package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AddStudentDetails {

	Connection con;
	PreparedStatement pre;
	Statement stat;
	ResultSet res;
	int rollno;
	String name;
	
	
	public AddStudentDetails()
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
	public void insert()


	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter RollNo. of the Student");
			rollno=sc.nextInt();
			System.out.println("Enter the Name of the Student");
			name=sc.next();
			
			pre=con.prepareStatement("insert into student1 values(?,?)");
			pre.setInt(1, rollno);
			pre.setString(2,name);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Student Details Committed..");
			else
				System.out.println("Student Details are Not Committed..");
			pre.close();
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void printStudentDetails()

	{
		try
		{
			stat=con.createStatement();
			res=stat.executeQuery("select * from student1");
			while(res.next())
			{
				System.out.println("Rollno : "+res.getInt("rollno"));
				System.out.println("Name : "+res.getString("name"));
				System.out.println("");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateStudentDetails()


	{
		try
		{
			pre=con.prepareStatement("update student1 set name=? where rollno=?");
			pre.setString(1, "Rohan");
			pre.setInt(2,1);
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Name updated for rollno 1");
			else
				System.out.println("Name is not updated..");
			pre.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteStudentDetails()

	{
		try
		{
			pre=con.prepareStatement("delete from student1 where rollno=?");
			pre.setInt(1,1);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Record Deleted...");
			else
				System.out.println("Record has not Deleted...");
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		AddStudentDetails ag=new AddStudentDetails();
		ag.insert();
		ag.printStudentDetails();
		System.out.println("=======================================================");
		ag.updateStudentDetails();
		ag.printStudentDetails();
		ag.deleteStudentDetails();
		ag.printStudentDetails();
	}

}
