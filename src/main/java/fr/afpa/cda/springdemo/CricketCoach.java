package fr.afpa.cda.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public void setEmail(String email) {
		System.out.println("email set");
		this.email = email;
	}
	public void setTeam(String team) {
		System.out.println("team set");
		this.team = team;
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	
	
	public CricketCoach() {
		System.out.println("cricket construct no arg");
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("cricket set");
	}

	public String getDailyWorkout() {
		return "cricket bla bla";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
