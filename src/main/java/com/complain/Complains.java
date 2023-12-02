package com.complain;

public class Complains {
	private int cusid;
	private String name;
	private String email;
	private String phone;
	private String topic;
	private String complain;
	private int agentid;
	private int comId;
	
	
	public Complains(int cusid, String name, String email, String phone, String topic, String complain, int agentid, int comId) {
		this.cusid = cusid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.topic = topic;
		this.complain = complain;
		this.agentid = agentid;
		this.comId = comId;
	}


	public int getCusid() {
		return cusid;
	}

	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getPhone() {
		return phone;
	}


	public String getTopic() {
		return topic;
	}

	public String getComplain() {
		return complain;
	}


	public int getAgentid() {
		return agentid;
	}


	public int getComId() {
		return comId;
	}


	

	
}
