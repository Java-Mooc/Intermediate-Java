
public class GoodStudent extends StudentReasonable {
	//Attributes
	protected int dailyStudyHours;

	//Constructores
	public GoodStudent() {
		this.dailyStudyHours = 0;
	}

	public GoodStudent(int hoursFun, int hoursStudyTest, int dailyStudyHours){
		super(hoursFun, hoursStudyTest);
		this.dailyStudyHours = dailyStudyHours;
	}

	//Advisors
	public int getDailyStudyHours() {
		return dailyStudyHours;
	}

	public void setDailyStudyHours(int dailyStudyHours) {
		this.dailyStudyHours = dailyStudyHours;
	}

	//Methods
	@Override
	public double probabilityToPass() {
		return 0.8;
	}
	
	public void increaseDailyStudyHours(int numHours) {
		this.setDailyStudyHours(Math.min(24*7, dailyStudyHours + numHours));
		
	}
	
	public void decreasesDailyStudyHours(int numHours) {
		this.setDailyStudyHours(Math.max(0, dailyStudyHours - numHours));
	}

	@Override
	public String toString() {
		return "GoodStudent: dailyStudyHours = " + getDailyStudyHours() + ", " + super.toString();
	}
}
