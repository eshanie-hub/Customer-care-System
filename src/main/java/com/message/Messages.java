package com.message;

public class Messages {
	private int messageid;
	private String name;
	private String phone;
	private String email;
	private String topic;
	private String description;
	private int cusid;
	private int agentid;
	
	public Messages(int messageid, String name, String phone, String email, String topic, String description,
			int cusid, int agentid) {
		this.messageid = messageid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.topic = topic;
		this.description = description;
		this.cusid = cusid;
		this.agentid = agentid;
		
		

	}

	public int getMessageid() {
		return messageid;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getTopic() {
		return topic;
	}

	public String getDescription() {
		return description;
	}

	public int getCusid() {
		return cusid;
	}

	public int getAgentid() {
		return agentid;
	}

}