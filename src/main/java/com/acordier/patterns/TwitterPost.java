package com.acordier.patterns;

public class TwitterPost implements SocialMessage {

	@Override
	public int send() throws Exception{
		System.out.println("Sending as a tweet");
		return 0;
	}

}
