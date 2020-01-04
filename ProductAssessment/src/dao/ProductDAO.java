package dao;

import java.sql.*;

import bean.Product;

public class ProductDAO {

	Connection con;
	PreparedStatement pst;
	CallableStatement cst;
	ResultSet rs;

	public ProductDAO()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("connection successful...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public int addproduct(Product p)
	{
		int ra=0;
		try {
		pst=con.prepareStatement("insert into Product values(?,?,?,?)");
		pst.setInt(1,p.getId());
		pst.setString(2,p.getName());
		pst.setInt(3,p.getId());
		pst.setString(4,p.getCategoy());
		ra=pst.executeUpdate();
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return ra;
	}
	
	public ResultSet viewProduct(int id)
	{
		try
		{
			pst=con.prepareStatement("Select * from Products where id=?");
			pst.setInt(1,id);
			rs=pst.executeQuery();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			return rs;
	}
	
	public ResultSet viewAllProduct()
	{
		try
		{
			pst=con.prepareStatement("select * from products");
			rs=pst.executeQuery();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			return rs;
	}
}
	
	
	
		

		
		
		
		
		
			