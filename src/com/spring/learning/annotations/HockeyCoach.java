package com.spring.learning.annotations;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "hockey coach : practice penalty shots";
	}

}
