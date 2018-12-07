package com.luv2code.spring.demo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress, team;
	
	//create no argument constructor
	public CricketCoach() {
		//System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	//Constructor for constructor injection
	public CricketCoach(FortuneService theFortuneService) {
		System.out.println("Cricket Coach constructor IoC test");
		this.fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	//create setter method for injections
	public void setFortuneService(FortuneService fortuneService) {
		//System.out.println("CricketCoach: inside setter");
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String theEmailAddress) {
		//System.out.println("Cricket Coach - inside email setter");
		this.emailAddress = theEmailAddress;
	}
	
	public void setTeam(String theTeam) {
		//System.out.println("Cricket Coach - inside team setter");
		this.team = theTeam;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
