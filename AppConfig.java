package com.jalaparthi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jalaparthi.controller.MessageController;
import com.jalaparthi.repository.MessageRepository;
import com.jalaparthi.repository.MessageRepositoryImpl;
import com.jalaparthi.service.MessageService;
import com.jalaparthi.service.MessageServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean
	public MessageRepository mr() {
		return new MessageRepositoryImpl();
		
	}
	@Bean
	public MessageService ms() {
		MessageService ms = new MessageServiceImpl( mr() );
		return ms;
	}

	@Bean
	public MessageController mc() {
		
		MessageController mc = new MessageController(ms());
		return mc;
	}
	
}
