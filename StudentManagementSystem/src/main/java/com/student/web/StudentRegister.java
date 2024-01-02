package com.student.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.student.dao.StudentDao;
import com.student.entity.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentRegister
 */
public class StudentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Student student;
	private StudentDao studentDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegister() {
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
		studentDao = new StudentDao();
		List<Student> students = studentDao.getStudents();
		out.println("<div align='center'>");
		out.println("<h1>Students Details List</h1>");
		out.println("<table border='3px' align='center' bordercolor='blue'>");
		out.println("<tr>");
		out.println("<th> ID </th>");
		out.println("<th> NAME </th>");
		out.println("<th> PASSWORD </th>");
		out.println("<th> EMAIL </th>");
		out.println("<th> GENDER </th>");
		out.println("<th> PHONE </th>");
		out.println("<th> EDIT </th>");
		out.println("<th> DELETE </th>");
		out.println("</tr>");
		for(Student student:students) {
			out.println("<tr>");
			out.println("<td>"+student.getId()+"</td>");
			out.println("<td>"+student.getName()+"</td>");
			out.println("<td>"+student.getPassword()+"</td>");
			out.println("<td>"+student.getEmail()+"</td>");
			out.println("<td>"+student.getGender()+"</td>");
			out.println("<td>"+student.getPhone()+"</td>");
			out.println("<td><button><a href='editurlservlet?id="+student.getId()+"'> EDIT </a></button>");
			out.println("<td><button><a href='deleteurl?id="+student.getId()+"'> DELETE </a></button>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("<button> <a href='index.jsp'>HOME</a></button>");
		out.println("<br>");
		out.println("<br>");
		out.println("</div");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");
		student = new Student(name,password,email,gender,phone);
		studentDao = new StudentDao();
		int result = studentDao.saveStudent(student);
		if(result==1) {
			out.println("<h2 align='center'>Record Registered Successfully</h2>");
		}
		else {
			out.println("<h2 align='center'>Record not registered successfully</h2>");
		}
		out.println("<button align='center'> <a href='index.jsp'>HOME</a></button>");
		
				
	}

}
