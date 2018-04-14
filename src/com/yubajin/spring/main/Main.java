package com.yubajin.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yubajin.spring.beans.Car;
import com.yubajin.spring.beans.User;

public class Main {
	public static void main(String[] args) {

		//1. 创建 Spring 的 IOC 容器
		//ApplicationContext代表IOC容器
		//ClassPathXmlApplicationContext:是ApplicationContext接口的实现类
		//该实现类从类路径下来加载配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2. 利用id从 IOC 容器中获取 bean 的实例
//		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		
		//3. 按类型从 IOC 容器中获取 bean 的实例
		//缺点，当返回多个相同类型的bean时，返回结果不唯一，保错
//		HelloWorld helloWorld_1 = ctx.getBean(HelloWorld.class);
		
//		helloWorld.hello();
//		helloWorld_1.hello();
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
		
		User user = (User) ctx.getBean("user");
		System.out.println(user);
		
		User user2 = (User) ctx.getBean("user2");
		System.out.println(user2);
		
	}
}
