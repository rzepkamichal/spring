package com.luv2code.spring.demo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//create no argument constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	//create setter method for injections
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
