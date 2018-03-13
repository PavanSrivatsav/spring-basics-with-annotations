package com.spring.learning.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach c = context.getBean("tennisCoachBean", Coach.class);
		System.out.println(c.getDailyWorkout());

		context.close();

		context.refresh();
		Coach hockey = context.getBean("hockeyCoach", Coach.class); // default-bean
		System.out.println(hockey.getDailyWorkout());

		context.close();

	}

}
