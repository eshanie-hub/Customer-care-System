package com.agent;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.agent.Agent;
import com.agent.DBConnect;

public class agentDButil {
	private static boolean isSuccess;
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	
	public static boolean validate(String agentid)
	{
		int convId=Integer.parseInt(agentid);
		ArrayList<Agent> agent=new ArrayList<>();
		
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql="select * from message where agentid='"+convId+"'";
	        ResultSet rs=stmt.executeQuery(sql);

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
	public static boolean insertmessage(int messageid,String name,String phone,String email,String topic,String description,String cusid,String agentid)
	{
		boolean isSuccess=false;
		int convId=Integer.parseInt(agentid);
		int cus=Integer.parseInt(cusid);
		
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql="insert into message values (0,'"+name+"','"+phone+"','"+email+"','"+topic+"','"+description+"','"+cusid+"','"+agentid+"')";
			int rs=stmt.executeUpdate(sql);
			//excuteupdate return 0 or 1
			if(rs>0)
			{
				isSuccess=true;
			}else
			{
				isSuccess=false;
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return isSuccess;
	}
	
	public static boolean respondissue(String messageid,String name,String phone,String email,String topic,String description,String cusid,String agentid)
	{
		int convId=Integer.parseInt(messageid);
		ArrayList<Agent> agent=new ArrayList<>();
		
		
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			Statement stmt=con.createStatement();

			String sql = "update message set  name='"+name+"', phone='"+phone+"', email='"+email+"',  topic='"+topic+"', description='"+description+"', cusid='"+cusid+"', agentid='"+agentid+"'"
					  + "where messageid='"+convId+"'";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0)
			{
				isSuccess=true;
			}
		else
		{
			isSuccess=false;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	public static boolean deleteissue(String messageid)
	{
		int convId=Integer.parseInt(messageid);
		
		try
		{
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			
			String sql="delete from message where messageid='"+convId+"'";
			int r=stmt.executeUpdate(sql);

			
			if(r>0)
			{
				isSuccess=true;
			}
			else
			{
				isSuccess=false;
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return isSuccess;
		}
	
	public static List<Agent> getissuedetails(String id)
	{
		int convId=Integer.parseInt(id);
		ArrayList<Agent> agent=new ArrayList<>();
		


     
		
		
		try
		{
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			
			String sql="select * from message where agentid='"+convId+"'";
	        ResultSet rs=stmt.executeQuery(sql);
	        
	        
	        while(rs.next())
	        {
	        	int messageid=rs.getInt(1);
		         String name=rs.getString(2);
		         String phone=rs.getString(3);
		         String email=rs.getString(4);
		         String topic=rs.getString(5);
		         String description=rs.getString(6);
		         int cusid=rs.getInt(7);
		         int agentid=rs.getInt(8);
		         
		         
		         Agent com=new Agent(messageid,name,phone,email,topic,description,cusid,agentid); 
		         agent.add(com);
	        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return agent;
		
	}
	
	
	
}
