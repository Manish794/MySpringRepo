package com.manish.spring.p1;

public class EmailNotification implements Notification {

	public void sendNotification(String content) {
		// Code to send email
		System.out.println("Email sent: " + content);
	}

}
