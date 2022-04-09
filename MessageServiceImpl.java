package com.jalaparthi.service;

import com.jalaparthi.repository.MessageRepository;

public class MessageServiceImpl implements MessageService {
		
	//Service layer object is Dependent on Repository Object
	// In Real world one Service can dependent on many Repository Object's, for now i am using one Repo Object. 
	// for defining dependency we need to create that dependent object(Reference Variable ) in our class.
	
	private MessageRepository mr; 
	
	public MessageServiceImpl(MessageRepository mr) { //This is the Injecting Point, we used constructor Method for injection
		this.mr =mr;
		
	}
	
	
	public String processMessage() {
		System.out.println("processMessage() of message Service Impl");
		return mr.getMessage();
	}

}
