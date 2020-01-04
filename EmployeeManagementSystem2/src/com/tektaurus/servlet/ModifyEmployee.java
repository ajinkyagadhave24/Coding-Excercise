package com.tektaurus.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tektaurus.bean.Employee;
import com.tektaurus.dao.EmployeeDA0;

/**
 * Servlet implementation class ModifyEmployee
 */
@WebServlet("/Modify")
public class ModifyEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 EmployeeDA0 dao;
	   Employee s;
	   PrintWriter out;
    public ModifyEmployee() {
    	 dao=new EmployeeDA0();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try
		{
			out=response.getWriter();
			out.println("Modify Servlet doGet Called");
			System.out.println("Modify Servlet doGet Called");
			int eid=Integer.parseInt(request.getParameter("eid"));
			int ra=dao.delete(eid);
			if(ra>0)
				out.println("<font color=green>Employee Details Deleted Succcessfully.</font><br>");
			else
				out.println("<font color=red>Employee Details are not deleted.</font><br>");
			out.println("To Go Back To The Form <a href='http://localhost:9090/EmployeeManagementSystem2/home.html'>Click Here</a>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		out=response.getWriter();
		System.out.println("In doPost of Modify Servlet..");
		int eid=Integer.parseInt(request.getParameter("eid"));
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String did=request.getParameter("did");
		
		s=new Employee(eid,fname,lname,email,did);
		int ra=dao.update(s);
		if(ra>0)
			out.println("<font color=green>Employee Details Updated Succcessfully.</font>");
		else
			out.println("<font color=red>Employee Details are not Updated.</font>");
		out.println("To Go Back To The Form <a href='http://localhost:9090/EmployeeManagementSystem2/home.html'>Click Here</a>");
	}

}
