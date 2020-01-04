package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     PrintWriter out;
     ProductDAO dao= new ProductDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		out=response.getWriter();
		ResultSet res=dao.viewAllProduct();
		out.println("<table border=3><tr><th>Product Id</th><th>Name</th><th>Price</th><th>Category</th></tr>");
		
			while(res.next())
			{
				out.println("<tr>");
				out.println("<td>"+res.getInt("id")+"</td>");
				out.println("<td>"+res.getString("name")+"</td>");
				out.println("<td>"+res.getDouble("price")+"</td>");
				out.println("<td>"+res.getString("category")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
