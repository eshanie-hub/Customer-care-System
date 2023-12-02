package com.employee;

public class employee {
	private int userid;
	private String name;
	private String email;
	private String phone;
	private String address;
	private String username;
	private String password;
	private String position;
	private int accountid;
	
	public employee(int userid, String name, String email, String phone, String address, String username,
			String password, String position, int accountid) {
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.username = username;
		this.password = password;
		this.position = position;
		this.accountid = accountid;
	}

	public int getUserid() {
		return userid;
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

	public String getAddress() {
		return address;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getPosition() {
		return position;
	}
	
	public int getAccountid() {
		return accountid;
	}


}
