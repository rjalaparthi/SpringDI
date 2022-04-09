package com.jalaparthi.controller;

import com.jalaparthi.service.MessageService;

public class MessageController {
	
	private MessageService ms; //created dependency object
	
	public MessageController(MessageService ms) { // created injection point
		
		this.ms=ms;
	}
	
	public String handleRequest() {
		
		System.out.println("handlerequest() of message controller");
		return ms.processMessage();
	}
}
