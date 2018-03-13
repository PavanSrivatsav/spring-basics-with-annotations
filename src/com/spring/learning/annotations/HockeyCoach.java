package com.spring.learning.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	private FortuneService fortuneService;

	public HockeyCoach() {

	}

	@Value("${coachCountry}")
	private String coach;

	@Autowired
	public HockeyCoach(@Qualifier("sadFortuneService") FortuneService fortuneService) { // if
																						// only
																						// one
																						// constructor
																						// is
																						// present
																						// then
																						// spring
																						// will
																						// automatically
																						// use
																						// @Autowired
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

	public String getCoachCountry() {
		return coach;
	}

}
