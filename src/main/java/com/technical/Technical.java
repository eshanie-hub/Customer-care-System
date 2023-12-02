package com.technical;

public class Technical {
	private int appId;
	private int cusId;
	private String name;
	private String appDate;
	private String appTime;
	private String email;
	private String phone;
	private String topic;
	private String agentid;
	
	
	public Technical(int appId, int cusId, String name, String appDate, String appTime, String email,
			String phone, String topic, String agentid) {
		this.appId = appId;
		this.cusId = cusId;
		this.name = name;
		this.appDate = appDate;
		this.appTime = appTime;
		this.email = email;
		this.phone = phone;
		this.topic = topic;
		this.agentid = agentid;
	}


	public int getAppId() {
		return appId;
	}


	public int getCusId() {
		return cusId;
	}


	public String getName() {
		return name;
	}


	public String getAppDate() {
		return appDate;
	}


	public String getAppTime() {
		return appTime;
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
	
	public String getAgentid() {
		return agentid;
	}

}
