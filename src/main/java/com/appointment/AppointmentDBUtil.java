package com.appointment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.complain.Complains;
import com.customer.DBConnect;

public class AppointmentDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static boolean sentAppointment(String cusid, String username, String email, String phone, String topic, String date, String time) {
		int convId = Integer.parseInt(cusid);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into appointment values (0, '"+convId+"', '"+username+"', '"+date+"', '"+time+"', '"+email+"', '"+phone+"', '"+topic+"', 0)";
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
	
	public static List<Appointments> getAppointment(String id){
		ArrayList<Appointments> appointments = new ArrayList<>();
		int convId = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from appointment where cusid='"+convId+"'";
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
				
				Appointments com = new Appointments(appId, cusId, name, appDate, appTime, email, phone, topic, agentid);
				appointments.add(com);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return appointments;
		
	}
	
	public static List<Appointments> getTechAppointment(String id){
		ArrayList<Appointments> appointments = new ArrayList<>();
		
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
				
				Appointments com = new Appointments(appId, cusId, name, appDate, appTime, email, phone, topic, agentid);
				appointments.add(com);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return appointments;
		
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
