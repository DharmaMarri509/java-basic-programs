package com.student.web;

import java.io.IOException;
import java.io.PrintWriter;

import com.student.dao.StudentDao;
import com.student.entity.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditUrlServlet
 */

public class EditUrlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDao studentDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUrlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("id"));
		studentDao = new StudentDao();
		Student student = studentDao.selectStudent(id);
		out.println("<div align='center'>");
		out.println("<form action='edit?id="+id+"' method='post'>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<td> Name :</td>");
		out.println("<td><input type='text' name='name' value='"+student.getName()+"'</td><br>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Password :</td>");
		out.println("<td><input type='password' name='password' value='"+student.getPassword()+"'</td><br>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>E-Mail :</td>");
		out.println("<td><input type='email' name='email' value='"+student.getEmail()+"'</td><br>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Gender :</td>");
		out.println("<td><input type='text' name='gender' value='"+student.getGender()+"'</td><br>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Phone :</td>");
		out.println("<td><input type='text' name='phone' value='"+student.getPhone()+"'</td>");
		out.println("</tr>");
		out.println("<tr>");
		
		out.println("</tr>");
		out.println("</table><br>");
		out.println("<td><button type='submit'>EDIT</button></td>");
		out.println("<td><button><a href='StudentRegister'>CANCEL</a></button></td><br>");
		out.println("</div>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
