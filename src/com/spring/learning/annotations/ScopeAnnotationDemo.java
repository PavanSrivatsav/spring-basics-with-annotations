package com.spring.learning.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAnnotationDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach hockeyA = context.getBean("hockeyCoach", Coach.class);
		Coach hockeyB = context.getBean("hockeyCoach", Coach.class);
		System.out.println(hockeyA + " " + hockeyB);

		Boolean isSame = (hockeyA == hockeyB); // true

		System.out.println("are same : " + isSame);

		Coach tennisA = context.getBean("tennisCoachBean", Coach.class);
		Coach tennisB = context.getBean("tennisCoachBean", Coach.class);

		Boolean isNotSame = (tennisA != tennisB);

		System.out.println(tennisA + " " + tennisB);
		System.out.println("are not same : " + isNotSame); // false

		context.close();

	}

}
