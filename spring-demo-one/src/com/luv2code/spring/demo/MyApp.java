package com.luv2code.spring.demo;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		Coach theCoach = new BaseballCoach();
		
		//use tge object
		System.out.println(theCoach.getDailyWorkout());
	}

}
