package com.luv2code.spring.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(){};
	
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
	
	public void setFortuneService(FortuneService theFortuneService){
		//System.out.println("Track Coach: Inside injected setter");
		this.fortuneService = theFortuneService;
	}

}

