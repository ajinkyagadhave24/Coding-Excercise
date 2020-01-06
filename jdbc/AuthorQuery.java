package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AuthorQuery {
	Connection con;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	public AuthorQuery()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Connected Successfully.....");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void select(String author)
	{
		try {
			st=con.createStatement();
//			rs=st.executeQuery("select * from author where firstname='"+author+"'");
//			while(rs.next())
//			{
//				System.out.println("Author id: "+rs.getInt(1));
//				System.out.println("Author name:"+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
//				System.out.println("Phone no: "+ rs.getLong(5));
//			}
			rs=st.executeQuery("select * from book where isbn in (select book.isbn from book_author,author,book where book.isbn=book_author.isbn and author.authorid=book_author.authord and firstname='"+author+"')");
			while(rs.next())
			{
				System.out.println("Title: "+rs.getString(1));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void update(String author,float price)
	{
		try {
			ps=con.prepareStatement("update book set price="+price+" where isbn = (select book.isbn from book_author,book,author where author.authorid=book_author.authord and book.isbn=book_author.isbn and author.firstname='"+author+"')");
			int ra=ps.executeUpdate();
			if(ra>0)
				System.out.println("Price updated");
			else
				System.out.println("Price is not updated..");
			ps.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
