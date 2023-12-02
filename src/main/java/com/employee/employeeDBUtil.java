package com.employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.employee.DBConnect;

public class employeeDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean validate(String username, String password) {
		
		//get connection from DBConnect and check query
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from employee where username='"+username+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<employee> getEmployee(String id){
	
		int Id = Integer.parseInt(id);
		ArrayList<employee> Employee = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from employee where accountid='"+Id+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int userid = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String address = rs.getString(5);
				String username = rs.getString(6);
				String password = rs.getString(7);
				String position = rs.getString(8);
				int accountid = rs.getInt(9);
				
				employee emp = new employee(userid, name, email, phone, address, username, password, position, accountid);
				Employee.add(emp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return Employee;
		
	}

	public static boolean insertEmployee(String name, String email, String phone , String address, String username, String password, String position) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into employee values (0, '"+name+"', '"+email+"', '"+phone+"', '"+address+"', '"+username+"', '"+password+"', '"+position+"', 0)";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean updateEmployee(String userid, String name, String email, String phone , String address, String username, String password, String position, String accountid) {
		int convId = Integer.parseInt(userid);
		int Id = Integer.parseInt(accountid);
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update employee set name='"+name+"', email='"+email+"', phone='"+phone+"', address='"+address+"', username='"+username+"', password='"+password+"', position='"+position+"' ,accountid='"+Id+"'"
						  + "where userid='"+convId+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean deleteEmployee(String id) {
		int convId = Integer.parseInt(id);
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql="delete from employee where userid='"+convId+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r > 0 ) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
}
