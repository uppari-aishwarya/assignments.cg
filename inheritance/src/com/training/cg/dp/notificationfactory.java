package com.training.cg.dp;

public class notificationfactory {
	public Notification createNotification(String medium) {
		if(medium.equalsIgnoreCase("sms"))
		{
			return new smsnotification();
		}
		else if(medium.equalsIgnoreCase("email"))
		{
			return new emailnotification();
		}
		else if(medium.equalsIgnoreCase("push"))
		{
			return new pushnotification();
		}
		else {
			return null;
		}
	}
	}


