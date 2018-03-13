package com.spring.learning.annotations;

import org.springframework.stereotype.Component;

@Component("tennisCoachBean")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	// @Autowired
	public TennisCoach(FortuneService fortuneService) { // if only one
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
		return "Tennis coach : practice backhand";
	}

	@Override
	public String getDailyFortune() {
		return "Tennis coach : " + fortuneService.getFortune();
	}

}
