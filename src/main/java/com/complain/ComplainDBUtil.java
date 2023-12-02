package com.complain;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.DBConnect;



public class ComplainDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean sentComplain(String cusid, String username, String email, String phone, String topic, String complain) {
		int convId = Integer.parseInt(cusid);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into complaindetails values ('"+convId+"', '"+username+"', '"+email+"', '"+phone+"', '"+topic+"', '"+complain+"', 0, 0)";
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
	

	public static List<Complains> getComplain(String id){
		ArrayList<Complains> complains = new ArrayList<>();
		int convId = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from complaindetails where cusid='"+convId+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int cusid = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String topic = rs.getString(5);
				String complain = rs.getString(6);
				int agentid = rs.getInt(7);
				int comId = rs.getInt(8);
				
				Complains com = new Complains(cusid, name, email, phone, topic, complain, agentid, comId);
				complains.add(com);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return complains;
		
	}
	
	public static boolean updateComplain(String cusid, String name, String email, String phone, String topic, String complain, String agentid, String comId) {
		int convId = Integer.parseInt(comId);
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update complaindetails set cusid='"+cusid+"', name='"+name+"', email='"+email+"', phone='"+phone+"', topic='"+topic+"', complain='"+complain+"', agentid='"+agentid+"'"
						  + "where comId='"+convId+"'";
			
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
	
	public static boolean deleteComplain(String comId) {
		boolean isSuccess = false;
		int convId = Integer.parseInt(comId);
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql="delete from complaindetails where comId='"+convId+"'";
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


