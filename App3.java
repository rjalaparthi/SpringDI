package com.jalaparthi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jalaparthi.controller.MessageController;

public class App3 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageController mc = context.getBean("mc", MessageController.class);
		String res = mc.handleRequest();
		System.out.println(res);
		
	}

}
