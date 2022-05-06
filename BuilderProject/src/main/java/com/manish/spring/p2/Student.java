package com.manish.spring.p2;

public class Student {
	private int sid;
	private String name;
	private String email;
	private long phone;

	public Student() {
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

	public Student withSid(int sid) {
		this.sid = sid;
		return this;
	}

	public Student withName(String name) {
		this.name = name;
		return this;
	}

	public Student withEmail(String email) {
		this.email = email;
		return this;
	}

	public Student withPhone(long phone) {
		this.phone = phone;
		return this;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}
