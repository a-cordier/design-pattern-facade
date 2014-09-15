package com.acordier.patterns;

/*
 * Facade implementation class
 */
public class MessagingFacade {
	
	private FacebookPost facebookPost;
	private TwitterPost twitterPost;
	private GooglePlusPost googlePlusPost;
	
	public MessagingFacade() {
		this.facebookPost = new FacebookPost();
		this.twitterPost = new TwitterPost();
		this.googlePlusPost = new GooglePlusPost();
	}
	
	/* 
	 * This coarse grain method can be used to merge 
	 * each API call and provide a transactional layer
	 * for this set of distributed services
	 */
	public int broadcast(){
		// BEGIN
		try {
			this.facebookPost.send();
			this.twitterPost.send();
			this.googlePlusPost.send();
			// COMMIT
		} catch (Exception e) {
			// ROLLBACK
			return 1;
		}
		return 0;
	}
	
	
}
