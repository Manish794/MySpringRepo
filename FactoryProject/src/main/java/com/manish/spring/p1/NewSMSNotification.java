package com.manish.spring.p1;

public class NewSMSNotification implements Notification {

	public void sendNotification(String content) {
		// Code to send SMS
		System.out.println("SMS Notifcation sent: " + content);
	}

}
