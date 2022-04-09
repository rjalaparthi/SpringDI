package com.jalaparthi;

import com.jalaparthi.controller.MessageController;
import com.jalaparthi.repository.MessageRepository;
import com.jalaparthi.repository.MessageRepositoryImpl;
import com.jalaparthi.service.MessageService;
import com.jalaparthi.service.MessageServiceImpl;

public class App {

	/*Here i want to create a object for Controller, but the controller object is dependent on service
	i am forced to created object of service, then service depends on repository i am forced to create Repo Object
	In this way imagine Controller is dependent on 10 Services and Service is dependent on 5 Repo. We have to create those many object to start the application
	*/

	public static void main(String[] args) {
		
		MessageRepository mr = new MessageRepositoryImpl(); // In future Repository might dependent on Data Sources, then we might need to create those objects as well to access Repository
		
		MessageService ms = new MessageServiceImpl(mr); // Service is dependent on repository
		
		MessageController mc = new MessageController(ms); // Controller is Dependent on Service Object
		

		String res = mc.handleRequest();
		
		System.out.println(res);
	}
}