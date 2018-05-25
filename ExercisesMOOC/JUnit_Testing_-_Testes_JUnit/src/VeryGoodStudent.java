
public class VeryGoodStudent extends GoodStudent {
	//Attributes
	protected int hoursSupport;

	//Constructores
	public VeryGoodStudent() {

	}

	public VeryGoodStudent(int hoursFun, int hoursStudyTest, int dailyStudyHours, int hoursSupport) {
		super(hoursFun, hoursStudyTest, dailyStudyHours);
		this.hoursSupport = hoursSupport;
	}

	//Advisors
	public int getHoursSupport() {
		return hoursSupport;
	}

	public void setHoursSupport(int hoursSupport) {
		this.hoursSupport = hoursSupport;
	}

	//Methods
	@Override
	public double probabilityToPass() {
		return 0.9;
	}
	
	public void increaseHoursSupport(int numHours) {
		this.setHoursSupport(Math.min(24*7, hoursSupport + numHours));
		
	}
	
	public void decreaseHoursSupport(int numHours) {
		this.setHoursSupport(Math.max(0, hoursSupport - numHours));
	}

	@Override
	public String toString() {
		return "VeryGoodStudent: hoursSupport = " + getHoursSupport() + ", " + super.toString();
	}
}
