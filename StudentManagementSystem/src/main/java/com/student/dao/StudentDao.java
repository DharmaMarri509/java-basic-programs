package com.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.student.entity.Student;

public class StudentDao {

	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/students";
	String username = "root";
	String password = "Ramu@9988";
	int result;
	
	

	//adding a new student...
	public int saveStudent(Student student) {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			String query = "insert into student(name,password,email,gender,phone)values(?,?,?,?,?)";
			PreparedStatement s = con.prepareStatement(query);
			s.setString(1, student.getName());
			s.setString(2, student.getPassword());
			s.setString(3, student.getEmail());
			s.setString(4, student.getGender());
			s.setString(5, student.getPhone());
			result = s.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return result;
		
	}
	
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<Student>();
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			String query = "select * from student";
			PreparedStatement s = con.prepareStatement(query);
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setPassword(rs.getString(3));
				st.setEmail(rs.getString(4));
				st.setGender(rs.getString(5));
				st.setPhone(rs.getString(6));
				students.add(st);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return students;
	}
	
	public int deleteStudent(int id) {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			String query = "delete from student where id=?";
			PreparedStatement s = con.prepareStatement(query);
			s.setInt(1, id);
			result = s.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return result;
	}
	public Student selectStudent(int id) {
		Student student = new Student();
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			String query = "select * from student where id=?";
			PreparedStatement s = con.prepareStatement(query);
			s.setInt(1, id);
			ResultSet rs = s.executeQuery();
			while (rs.next()) {
				id = rs.getInt(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String email = rs.getString(4);
				String gender = rs.getString(5);
				String phone = rs.getString(6);
				student = new Student(name,password,email,gender,phone);
			}
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return student;
	}
	
	public int updateStudent(Student student) {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			String query = "update student set name=?,password=?,email=?,gender=?,phone=? where id=?";
			PreparedStatement s = con.prepareStatement(query);
			s.setString(1, student.getName());
			s.setString(2, student.getPassword());
			s.setString(3, student.getEmail());
			s.setString(4, student.getGender());
			s.setString(5, student.getPhone());
			s.setInt(6, student.getId());
			result = s.executeUpdate();
			System.out.println(student.getId());
			System.out.println(result);
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return result;
		
	}
	
	
}
