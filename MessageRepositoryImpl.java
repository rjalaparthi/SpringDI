package com.jalaparthi.repository;

public class MessageRepositoryImpl implements MessageRepository {
	
	//Dependency for this Repository could be on dataSource (Regular JDBC , JDBC Template)

	public String getMessage() {
		
		System.out.println("getMessage() of Repository Service Impl");
		
		return "Hello World!!"; // In general we will get value from Database, but i am hard  coding for now.
	}

}
