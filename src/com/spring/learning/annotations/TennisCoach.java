package com.spring.learning.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tennisCoachBean")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public void setFortuneService(FortuneService fortuneService) { // setter-Autowired-example
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
