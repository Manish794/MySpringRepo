package com.manish.spring.p1.test;

import com.manish.spring.p1.Notification;
import com.manish.spring.p1.NotificationFactory;
import com.manish.spring.p1.NotificationType;

public class SMSTest {
	public static void main(String[] args) {
		Notification notify = NotificationFactory.getNotification(NotificationType.SMS);
		notify.sendNotification("Registration Successfully completed");
	}
}
