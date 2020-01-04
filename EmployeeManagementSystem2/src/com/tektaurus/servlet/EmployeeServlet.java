package com.tektaurus.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tektaurus.bean.Employee;
import com.tektaurus.dao.EmployeeDA0;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/Employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   EmployeeDA0 dao;
	   Employee s;
	   PrintWriter out;
    public EmployeeServlet() {

       dao=new EmployeeDA0();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			out=response.getWriter();
			int eid=Integer.parseInt(request.getParameter("eid"));
			ResultSet res=dao.retrieve(eid);
			out.println("<table border=3><tr><th>Employee Id</th><th>Employee FirstName</th><th>Employee Lastname</th><th>Email</th><th>Departmentid</th></tr>");
			while(res.next())
			{
				out.println("<tr>");
				out.println("<td>"+res.getInt("eid")+"</td>");
				out.println("<td>"+res.getString("fname")+"</td>");
				out.println("<td>"+res.getString("lname")+"</td>");
				out.println("<td>"+res.getString("email")+"</td>");
				out.println("<td>"+res.getInt("did")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out=response.getWriter();
		int eid=Integer.parseInt(request.getParameter("eid"));
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		int did=Integer.parseInt(request.getParameter("did"));
		
		s=new Employee(eid,fname,lname,email,did);
		int ra=dao.insert(s);
		if(ra>0)
			out.println("<font color=green>Employee Details Inserted Succcessfully.</font>");
		else
			out.println("<font color=red>Employee Details are not inserted.</font>");
		out.println("To Go Back To The Form <a href='http://localhost:9090/EmployeeManagementSystem2/home.html'>Click Here</a>");
			
	}

	
	

}
