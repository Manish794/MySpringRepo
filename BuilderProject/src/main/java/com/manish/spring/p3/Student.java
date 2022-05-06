package com.manish.spring.p3;

// Java Bean Class
// POJO Class (Pure Old Java Object)
// Domain Class
public class Student {
	private int sid;
	private String name;
	private String email;
	private long phone;

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

	private Student(StudentBuilder builder) {
		this.sid = builder.sid;
		this.name = builder.name;
		this.email = builder.email;
		this.phone = builder.phone;
	}

	public static StudentBuilder builder() {
		return new StudentBuilder();
	}

	static class StudentBuilder {
		private int sid;
		private String name;
		private String email;
		private long phone;

		private StudentBuilder() {
		}

		public StudentBuilder sid(int sid) {
			this.sid = sid;
			return this;
		}

		public StudentBuilder name(String name) {
			this.name = name;
			return this;
		}

		public StudentBuilder email(String email) {
			this.email = email;
			return this;
		}

		public StudentBuilder phone(long phone) {
			this.phone = phone;
			return this;
		}

		public Student build() {
			return new Student(this);
		}

	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}
