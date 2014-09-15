package com.acordier.patterns;

/*
 * Facade Pattern in action
 */
public class FacadeApp {
	public static void main(String[] args) {
		MessagingFacade messagingFacade = new MessagingFacade();
		messagingFacade.broadcast();
	}
}
