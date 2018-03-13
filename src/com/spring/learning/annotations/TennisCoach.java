package com.spring.learning.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

	@PostConstruct
	public String afterContext() {
		return "DI successfully done";
	}

	@PreDestroy
	public String beforeDestroyingContext() {
		return "context going to end";
	}

}
