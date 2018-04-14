package com.yubajin.spring.beans;

public class HelloWorld {
	private String username;
	
	public HelloWorld() {
		System.out.println("HelloWorld's constructor...");
	}
	
	public HelloWorld(String username) {
		this.username = username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void hello() {
		System.out.println("Hello," + username);
	}
	
}
