package com.luv2code.spring.demo;

public class BaseballCoach implements Coach{
	
	//field for dependency
	private FortuneService fortuneService;
	
	//constructor for dependency
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice for 30 minutes!";
	}

	@Override
	public String getDailyFortune() {
		
		//use my FortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
