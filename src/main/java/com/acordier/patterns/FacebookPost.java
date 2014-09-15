package com.acordier.patterns;

public class FacebookPost implements SocialMessage{
	
	public int send() throws Exception{
		System.out.println("Sending as a FB status");
		return 0; // status
	}
}
