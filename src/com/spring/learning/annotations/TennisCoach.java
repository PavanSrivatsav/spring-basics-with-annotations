package com.spring.learning.annotations;

import org.springframework.stereotype.Component;

@Component("tennisCoachBean")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "practice backhand";
	}

}
