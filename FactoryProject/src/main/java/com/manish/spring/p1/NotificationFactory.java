package com.manish.spring.p1;

public class NotificationFactory {

	public static Notification getNotification(NotificationType type) {
		switch (type) {
		case SMS:
			return new NewSMSNotification();
		case EMAIL:
			return new EmailNotification();
		}
		throw new IllegalArgumentException("Invalid notification type " + type);
	}

}
