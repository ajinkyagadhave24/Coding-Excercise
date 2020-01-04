package dao;

import java.sql.*;

import bean.user;


public class UserDAO {

	Connection con;
	PreparedStatement ps;
	CallableStatement cs;
	ResultSet rs;
	
	public UserDAO()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Connection Cuccessful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public int addUser(user u)
	{
		int ra=0;
		try {
			ps=con.prepareStatement("insert into user values(?,?,?)");
			ps.setInt(1, u.getLoginid());
			ps.setString(2,u.getPassword());
			ps.setString(3,u.getEmail());
			ra=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ra;
	}
	
	public boolean validateUser(int loginid,String password)
	{
		boolean flag=false;
		try
		{
			
			ps=con.prepareStatement("select * from users");
			rs=ps.executeQuery();
			while(rs.next())
			{
				if(rs.getInt("loginid")==loginid && rs.getString("password")==password)
					flag=true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
}
}

