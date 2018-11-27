package com.luv2code.spring.demo;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Practice for 30 minutes!";
	}

}
