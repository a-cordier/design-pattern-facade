package com.acordier.patterns;

/*
 * Facade implementation class
 */
public class MessagingFacade {
	
	private FacebookPost facebookPost;
	private TwitterPost twitterPost;
	private GooglePlusPost googlePlusPost;
	private PlainOldMailer plainOldMailer;
	
	public MessagingFacade() {
		this.facebookPost = new FacebookPost();
		this.twitterPost = new TwitterPost();
		this.googlePlusPost = new GooglePlusPost();
		this.plainOldMailer = new PlainOldMailer();
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
			this.plainOldMailer.sendToMailingList();
			// COMMIT
		} catch (Exception e) {
			// ROLLBACK
			return 1;
		}
		return 0;
	}
	
	
}
