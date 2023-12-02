package com.message;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.complain.Complains;
import com.customer.DBConnect;


public class MessageDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean sentMessage(String cusid, String name, String email, String phone, String topic, String description) {
		int convId = Integer.parseInt(cusid);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into message values (0, '"+name+"', '"+phone+"', '"+email+"',  '"+topic+"', '"+description+"', '"+cusid+"', 0)";
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
	
	public static List<Messages> getMessage(String id){
		ArrayList<Messages> messages = new ArrayList<>();
		int convId = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from message where cusid='"+convId+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int messageid = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String email = rs.getString(4);
				String topic = rs.getString(5);
				String description = rs.getString(6);
				int cusid = rs.getInt(7);
				int agentid = rs.getInt(8);
				
				Messages com = new Messages(messageid, name, phone, email, topic, description, cusid, agentid);
				messages.add(com);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return messages;
		
	}
	
	public static boolean updateMessage(String messageid, String name, String phone, String email, String topic, String description, String cusid, String agentid) {
		int convId = Integer.parseInt(messageid);
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update message set  name='"+name+"', phone='"+phone+"', email='"+email+"',  topic='"+topic+"', description='"+description+"', cusid='"+cusid+"', agentid='"+agentid+"'"
						  + "where messageid='"+convId+"'";
			
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
	
	public static boolean deleteMessage(String messageid) {
		boolean isSuccess = false;
		int convId = Integer.parseInt(messageid);
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql="delete from message where messageid='"+convId+"'";
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
