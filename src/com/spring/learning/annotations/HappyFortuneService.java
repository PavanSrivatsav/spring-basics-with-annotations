package com.spring.learning.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today your fortune level is high! Try to do great things!";
	}

}
