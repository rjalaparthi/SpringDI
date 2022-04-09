package com.jalaparthi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jalaparthi.controller.MessageController;

public class App2 {

	public static void main(String[] args) {
		
		//We created Spring Container instance, It is implemented through java object. From name ClassPathXmlApplicationContext we know it reads xml file via class path.
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Here we are using getBean which takes actual type so that we can get the same type
		MessageController mc =	context.getBean("mc", MessageController.class);
		
		String res = mc.handleRequest();
		
		System.out.println(res);
	}

}
