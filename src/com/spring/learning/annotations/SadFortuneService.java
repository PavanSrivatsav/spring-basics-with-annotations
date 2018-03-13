package com.spring.learning.annotations;

import org.springframework.stereotype.Service;

@Service
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "low fortune level. Be careful!";
	}

}
