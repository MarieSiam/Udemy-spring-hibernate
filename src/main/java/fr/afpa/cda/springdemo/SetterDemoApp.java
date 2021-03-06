package fr.afpa.cda.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		context.close();

	}

}
