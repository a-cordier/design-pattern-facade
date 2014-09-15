package com.acordier.patterns;

public class GooglePlusPost implements SocialMessage {

	@Override
	public int send() throws Exception {
		System.out.println("Sending as a Google plus post");
		return 0;
	}
	
}
