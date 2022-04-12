package fr.afpa.cda.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	public BaseballCoach() {};
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService  = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "bla bla baseball";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
