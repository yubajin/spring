package com.yubajin.spring.beans;

import java.util.List;

public class User {

	private String userName;
	private List<Car> cars;
	
	private String wifeName;

	public User(String userName, List<Car> cars, String wifeName) {
		super();
		this.userName = userName;
		this.cars = cars;
		this.wifeName = wifeName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public User() {
		super();
		System.out.println("User's constructor...");
	}
	
	public void init() {
		System.out.println("init method...");
	}
	
	public void destroy() {
		System.out.println("destroy method...");
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", cars=" + cars + ", wifeName=" + wifeName + "]";
	}
	
}
