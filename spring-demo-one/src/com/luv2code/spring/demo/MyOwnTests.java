package com.luv2code.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyOwnTests {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CrossfitCoach theCoach = context.getBean("myCrossfitCoach",CrossfitCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		//System.out.println(theCoach.getDailyFortune());
		
		context.close();

	}

}
