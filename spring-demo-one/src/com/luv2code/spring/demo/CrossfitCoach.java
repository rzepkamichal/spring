package com.luv2code.spring.demo;

public class CrossfitCoach implements Coach {

	private FortuneService fortuneService;
	
	public CrossfitCoach() {};
	
	public CrossfitCoach(FortuneService theFortuneService) {
		//System.out.println("Crossfit Coach: inside injected constructor");
		this.fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice some Kettle Swing!";
	}

	@Override
	public String getDailyFortune() {
	
		return "Lucky you - don't have to run today";
	}

}
