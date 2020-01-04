package com.tektaurus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tektaurus.bean.Employee;

public class EmployeeDA0 {

	Connection con;
	PreparedStatement pre;
	ResultSet res;
	
	public EmployeeDA0()

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

	public int insert(Employee s)

	{
		System.out.println("In Insert");
		int ra=0;
		try
		{
			pre=con.prepareStatement("insert into employee values(?,?,?,?,?)");
			pre.setInt(1, s.getEmployee_id());
			pre.setString(2,s.getFirst_name());
			pre.setString(3, s.getLast_name());
			pre.setString(4,s.getEmail());
			pre.setInt(5, s.getDepartment_id());
			ra=pre.executeUpdate();
			pre.close();
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ra;
	}
	public int update(Employee s)

	{
		System.out.println("In Update");
		int ra=0;
		try
		{
			pre=con.prepareStatement("update employee set first_name=?,last_name=?,Email=?,department_id=? where employee_id=?");
			pre.setInt(5, s.getEmployee_id());
			pre.setString(1,s.getFirst_name());
			pre.setString(2, s.getLast_name());
			pre.setString(3,s.getEmail());
			pre.setInt(4, s.getDepartment_id());
			ra=pre.executeUpdate();
			pre.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ra;
	}
	public int delete(int employee_id)

	{
		System.out.println("In Delete");
		int ra=0;
		try
		{
			pre=con.prepareStatement("delete from employee where sid=?");
			pre.setInt(1, employee_id);
			
			ra=pre.executeUpdate();
			pre.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ra;
	}
	public ResultSet retrieve(int employee_id)
	{
		System.out.println("In Retrieve");
		try
		{
			
			pre=con.prepareStatement("select * from employee where employee_id=?");
			pre.setInt(1,employee_id);
			res=pre.executeQuery();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return res;
	}
}
