package com.manish.spring.p4;

// Java Bean Class
// POJO Class (Pure Old Java Object)
// Domain Class
public class Student {
	private int sid;
	private String name;
	private String email;
	private long phone;

	
	
	public Student(int sid, String name, String email, long phone) {
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public long getPhone() {
		return phone;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}
