package com.luv2code.spring.demo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "It's your lucky day!";
	}

}
