package com.technical;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.technical.Technical;
import com.technical.DBConnect;

public class TechnicalDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static boolean sentAppointment(String cusid, String username, String date, String time, String email, String phone, String topic , String agentid) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into appointment values (0, '"+cusid+"', '"+username+"', '"+date+"', '"+time+"', '"+email+"', '"+phone+"', '"+topic+"', '"+agentid+"')";
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
	
	public static List<Technical> getTechAppointment(String id){
		ArrayList<Technical> technical = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from appointment where agentid='"+id+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int appId = rs.getInt(1);
				int cusId = rs.getInt(2);
				String name = rs.getString(3);
				String appDate = rs.getString(4);
				String appTime = rs.getString(5);
				String email = rs.getString(6);
				String phone = rs.getString(7);
				String topic = rs.getString(8);
				String agentid = rs.getString(9);
				
				Technical com = new Technical(appId, cusId, name, appDate, appTime, email, phone, topic, agentid);
				technical.add(com);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return technical;
		
	}
	public static boolean updateAppointment(String appId, String cusId, String name, String appDate, String appTime, String email, String phone, String topic, String agentid) {
		int convId = Integer.parseInt(appId);
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update appointment set cusId='"+cusId+"', name='"+name+"', appDate='"+appDate+"', appTime='"+appTime+"', email='"+email+"', phone='"+phone+"', topic='"+topic+"', agentid='"+agentid+"'"
						  + "where appId='"+convId+"'";
			
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
	
	public static boolean deleteAppointment(String appId){
		boolean isSuccess = false;
		int convId = Integer.parseInt(appId);
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql="delete from appointment where appId='"+convId+"'";
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
