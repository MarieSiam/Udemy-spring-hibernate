package fr.afpa.cda.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	public TrackCoach() {};
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService  = theFortuneService;
	}

	public String getDailyWorkout() {
		return "bla bla track";
	}

	public String getDailyFortune() {
		return "Just : "+fortuneService.getFortune();
	}

	public void doInitStuff() {
		System.out.println("track : inside init");
	}
	
	public void doCleanUpStuff() {
		System.out.println("track : inside cleanup");
	}
	
}
