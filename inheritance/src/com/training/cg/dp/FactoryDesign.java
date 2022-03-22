package com.training.cg.dp;

public class FactoryDesign {
public static void main(String args[]) {
	notificationfactory factory=new notificationfactory();
	Notification notification=factory.createNotification("sms");
	notification.NotifyUser();
			
}
}
