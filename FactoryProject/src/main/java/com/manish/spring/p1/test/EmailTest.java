package com.manish.spring.p1.test;

import com.manish.spring.p1.Notification;
import com.manish.spring.p1.NotificationFactory;
import com.manish.spring.p1.NotificationType;

public class EmailTest {
	public static void main(String[] args) {
		Notification notify = NotificationFactory.getNotification(NotificationType.EMAIL);
		notify.sendNotification("Registration Successfully completed");
		
	}
}
