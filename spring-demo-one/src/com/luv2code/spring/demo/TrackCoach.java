package com.luv2code.spring.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
	
		return "Run 10 Kilometers!!!";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It: " + this.fortuneService.getFortune();
	}

}

