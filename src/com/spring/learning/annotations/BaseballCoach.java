package com.spring.learning.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "baseball coach : try to strikeout";
	}

	@Override
	public String getDailyFortune() {
		return "baseball coach : " + fortuneService.getFortune();
	}

}
