package com.spring.learning.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public HockeyCoach(FortuneService fortuneService) { // if only one
														// constructor is
														// present then spring
														// will automatically
														// use @Autowired
														// annotation.
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "hockey coach : practice penalty shots";
	}

	@Override
	public String getDailyFortune() {
		return "hockey coach : " + fortuneService.getFortune();
	}

}
