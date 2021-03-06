package com.spring.learning.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach c = context.getBean("tennisCoachBean", Coach.class);
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());

		context.close();

		context.refresh();
		Coach hockey = context.getBean("hockeyCoach", Coach.class); // default-bean
		System.out.println(hockey.getDailyWorkout());
		System.out.println(hockey.getDailyFortune());

		context.close();

		context.refresh();

		Coach baseball = context.getBean("baseballCoach", Coach.class); // default-bean
		System.out.println(baseball.getDailyWorkout());
		System.out.println(baseball.getDailyFortune());

		context.close();

		context.refresh();
		System.out.println("============");
		HockeyCoach h = context.getBean("hockeyCoach", HockeyCoach.class);
		System.out.println("coach country=>" + h.getCoachCountry());

		context.close();

		context.refresh();
		System.out.println("========");
		TennisCoach t = new TennisCoach();
		System.out.println(t.afterContext());
		System.out.println(t.beforeDestroyingContext());
		context.close();

	}

}
