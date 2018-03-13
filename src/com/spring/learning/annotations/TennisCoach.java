package com.spring.learning.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoachBean")
@Scope("prototype")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public void setFortuneService(@Qualifier("happyFortuneService") FortuneService fortuneService) { // setter-Autowired-example
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
